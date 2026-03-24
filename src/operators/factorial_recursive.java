package operators;

import java.util.*;

public class factorial_recursive {
     public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial does not exist");
        } else {
            long result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        sc.close();
    }
}
