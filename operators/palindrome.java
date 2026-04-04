package operators;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num1 = sc.nextInt();

        int original = num1;
        int reverse = 0;

        while (num1 != 0) {
            int digit = num1 % 10;
            reverse = reverse * 10 + digit;
            num1 = num1 / 10;
        }
        if (original == reverse) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
