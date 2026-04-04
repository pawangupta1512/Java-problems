package operators;

import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        double p = sc.nextDouble();
        System.out.println("Enter time: ");
        int t = sc.nextInt();
        System.out.println("Enter rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter number of times ci per year: ");
        int n = sc.nextInt();
        double amount = p * Math.pow((1 + r / (n * 100)) , n * t);
        double ci = amount - p;
        System.out.println("Compound Interest: " + ci);
        sc.close();
    }
}