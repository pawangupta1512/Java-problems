package operators;

import java.util.Scanner;

public class areaOfTriangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of triangle is: " + area);
        sc.close();
    }
}
