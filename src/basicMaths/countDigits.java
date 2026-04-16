package basicMaths;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
        System.out.print(count);
        sc.close();
    }
}
