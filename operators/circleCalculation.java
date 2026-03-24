package operators;

import java.util.Scanner;

public class circleCalculation {

     // Method to calculate circumference
    public static double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }

    // Method to calculate area
    public static double calculateArea(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        // Calling methods
        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        sc.close();
    }
    
}
