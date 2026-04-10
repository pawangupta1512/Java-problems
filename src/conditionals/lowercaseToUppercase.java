package conditionals;

import java.util.Scanner;

public class lowercaseToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char ch = sc.next().charAt(0);
    
        char upper = Character.toUpperCase(ch);

        System.out.println("Uppercase: " + upper);

        sc.close();
    }
}
