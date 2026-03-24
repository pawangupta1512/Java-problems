package operators;

import java.util.*;

public class swapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter first number: ");
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("first number after swapping: " +a);
        System.out.println("second number after swapping: " +b);
        sc.close();
    }
}
