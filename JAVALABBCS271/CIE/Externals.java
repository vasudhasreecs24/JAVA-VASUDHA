package SEE;

import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {
    protected int marks[];
    protected int finalMarks[];

    public Externals() {
        marks = new int[5];
        finalMarks = new int[5];
    }

    public void inputSEEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter SEE Marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = s.nextInt();
        }
    }

    public void calculateFinalMarks() {
    for (int i = 0; i < 5; i++) {
        finalMarks[i] = super.marks[i] + (marks[i] / 2); 
    }
}


    public void displayFinalMarks() {
        displayStudentDetails();
        System.out.println("Final Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i+1) + ": " + finalMarks[i]);
        }
    }
}
