package conditionals;

import java.util.Scanner;

public class upperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a uppercase character: ");
        char ch = sc.next().charAt(0);
        
        char lower = Character.toLowerCase(ch);

        System.out.println("Lowercase: " + lower);
        sc.close();
    }
}
