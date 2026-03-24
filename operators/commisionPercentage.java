package operators;

import java.util.Scanner;

public class commisionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter price: ");
        double price = sc.nextDouble();
        System.out.print("enter commission: ");
        double commission = sc.nextDouble();
        double commissionPercentage = commission / price * 100;
        System.out.println("commission percentage = " + commissionPercentage);
        sc.close();
    }
}
