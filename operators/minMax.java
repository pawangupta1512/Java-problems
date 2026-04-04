package operators;

import java.util.Scanner;
public class minMax {
    public static void printMax(int a , int b , int c) {
        int max = a;
        if (b > max) {
            max = b;
        } 
        if (c > max) {
            max = c;
        }
        System.out.println("maximum number: " + max );
    }
    public static void printMin(int a , int b , int c) {
        int min = a;
        if (b < min) {
            min = b;
        } 
        if (c < min) {
            min = c;
        }
        System.out.println("minimum number: " + min );
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number 1: ");
    int a = sc.nextInt();

    System.out.print("enter number 2: ");
    int b = sc.nextInt();

    System.out.print("enter number 3: ");
    int c = sc.nextInt();

    printMax(a, b, c);
    printMin(a, b, c);
    sc.close();
}
}
