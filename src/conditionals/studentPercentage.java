package conditionals;

import java.util.Scanner;

public class studentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = 0;

        // loop for 5 subjects
        for(int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            float marks = sc.nextFloat();
            total += marks;
        }

        // calculate percentage
        float percentage = (total / 500) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
