package operators;

import java.util.Scanner;

public class calculatorIf {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator: ");
        String op = sc.next();

        double result = 0;

        if (op.equals("+")) {
            result = num1 + num2;
        } else if (op.equals("-")) {
            result = num1 - num2;
        } else if (op.equals("*")) {
            result = num1 * num2;
        } else if (op.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! division by zero");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid operator");
            sc.close();
            return;
        }
        System.out.println("Result = " + result);
        sc.close();
        }
}
