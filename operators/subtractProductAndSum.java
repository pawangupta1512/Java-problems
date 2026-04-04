package operators;

import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int sum = 0;

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            sum += digit;
            temp /=10;
        }
        int result = product - sum;
        System.out.println("product of digits: " + product);
        System.out.println("sum of digit: " + sum);
        System.out.println("subtraction of product and sum of digits: " + result);
        sc.close();
    }
}
