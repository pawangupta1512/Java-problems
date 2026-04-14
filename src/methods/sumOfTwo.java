package methods;

import java.util.Scanner;

public class sumOfTwo {
    static int sum(int a, int b) {
        return a + b;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = sum(a, b);

        System.out.println("Sum = " + result);
        sc.close();
     }
}
