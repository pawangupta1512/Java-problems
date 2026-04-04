package operators;

import java.util.*;

public class swapWithoutThirdVariable {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("Enter number: ");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping: ");
        System.out.println("First Number: " +a);
        System.out.println("Second Number: " +b);
        sc.close();
    }
}
