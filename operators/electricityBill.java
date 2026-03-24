package operators;

import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter units: ");
        double unit = sc.nextDouble();
        double bill = 0;
        if (bill <= 50) {
            bill = unit * 3.25;
        } else if (bill <=100) {
            bill = (unit * 3.25) + (unit - 50) * 4.5;
        } else if (bill <=200) {
            bill = (unit * 3.25) + (unit * 4.5) + (unit - 100) * 5.5;
        } else {
            bill = (unit * 3.25) + (unit * 4.5) + (unit * 5.5) + (unit - 200) * 6.5;
        }
        bill += 100;
        System.out.println("total bill is: " + bill);
        sc.close();
    }
}
