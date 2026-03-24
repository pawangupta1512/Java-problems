package operators;

import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number: ");
        int n = sc.nextInt();

        System.out.print("Enter number of items chosen: ");
        int r = sc.nextInt();

         // Input validation
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input! Ensure 0 ≤ r ≤ n.");
            return;
        }

        long factN = 1,  factR = 1, factNR = 1;

        // n!
        for (int i = 1; i <= n; i++) {
            factN *= i;
        }

        // r!
        for (int i = 1; i <= r; i++) {
            factR *= i;
        }

        // (n-r)!
        for (int i = 1; i <= (n - r ); i++) {
            factNR *= i;
        }

        long nCr = factN / (factR * factNR);
        long nPr = factN / factNR;
        System.out.println("nCr: " + nCr);
        System.out.println("nPr: " + nPr);
        sc.close();
    }
}
