package basicMaths;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
}
    if (original == reverse) {
        System.out.print(original + " is a palindrome number");
    }
    else {
        System.out.print("not palindrome");
        sc.close();
    }
    }
}