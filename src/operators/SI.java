package operators;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        double simpleInterest = (( principal * rate * time) / 100);
        System.out.println("Simple interest is: " + simpleInterest);
        sc.close();
    }
}
