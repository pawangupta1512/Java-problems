package operators;

import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.print(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        sc.close();
    }
}
