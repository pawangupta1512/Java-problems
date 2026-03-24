package operators;

import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        int first = 0 , second = 1;
        System.out.println("fibbanocci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
