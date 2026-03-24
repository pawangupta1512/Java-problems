package operators;

import java.util.Scanner;

public class cGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = sc.nextDouble();

            double gradePoint = marks / 10;  // simple conversion
            total += gradePoint;
        }

        double cgpa = total / n;
        double percentage = cgpa * 9.5;

        System.out.println("\nCGPA: " + cgpa);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}