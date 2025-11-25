import SEE.Externals;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = s.nextInt();

        Externals stu[] = new Externals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i+1) + " ---");
            stu[i] = new Externals();
            stu[i].inputStudentDetails();
            stu[i].inputCIEmarks();
            stu[i].inputSEEmarks();
            stu[i].calculateFinalMarks();
        }
                                                                                                                                                                                                                              
        System.out.println("\n===== FINAL MARKS =====");
        for (int i = 0; i < n; i++) {
            stu[i].displayFinalMarks();
            System.out.println("---------------------");
        }
    }
}

