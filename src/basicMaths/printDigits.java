package basicMaths;

import java.util.Scanner;

public class printDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit);

            num /= 10;
        }
    }
}
