import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

class Student {
    String name, usn;
    double SGPA;
    Scanner s = new Scanner(System.in);
    Subject[] subject = new Subject[8];

    Student() {
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
    }

    void getStudentDetails() {
        System.out.print("Enter Student Name: ");
        name = s.nextLine();
        System.out.print("Enter Student USN: ");
        usn = s.nextLine();
    }

    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("\nSubject " + (i + 1) + ":");
            System.out.print("Enter Marks (0-100): ");
            int marks = s.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter again:");
                marks = s.nextInt();
            }
            subject[i].subjectMarks = marks;

            System.out.print("Enter Credits for Subject " + (i + 1) + ": ");
            subject[i].credits = s.nextInt();

            subject[i].grade = (subject[i].subjectMarks / 10) + 1;
            if (subject[i].grade == 11)
                subject[i].grade = 10;
            if (subject[i].grade <= 4)
                subject[i].grade = 0;
        }
        s.nextLine(); 
    }

    void computeSGPA() {
        int totalScore = 0, totalCredits = 0;
        for (int i = 0; i < 8; i++) {
            totalScore += subject[i].grade * subject[i].credits;
            totalCredits += subject[i].credits;
        }
        SGPA = (double) totalScore / totalCredits;
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f\n", SGPA);
    }
}

public class sgpa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2]; // For two students

        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getStudentDetails();
            students[i].getMarks();
            students[i].computeSGPA();
        }

        System.out.println("\n=========== STUDENT RESULTS ===========");
        for (int i = 0; i < 2; i++) {
            students[i].display();
        }

        sc.close();
    }
}