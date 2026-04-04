package operators;

import java.util.Scanner;

public class battingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total runs scored: ");
        double runs = sc.nextDouble();
        System.out.print("Total dismissals: ");
        int dismissals = sc.nextInt();

        double average = runs / dismissals;
        System.out.println("Average: " + average);
        sc.close();
    }
}
