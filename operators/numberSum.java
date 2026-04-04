package operators;

import java.util.Scanner;

public class numberSum {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        System.out.println("Enter numbers (0 to stop): ");

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                negativeSum += num;
            } 
            else if (num % 2 == 0) {
                positiveEvenSum += num;
            } 
            else {
                positiveOddSum += num;
            }
        }

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);

        sc.close();
    }
}
