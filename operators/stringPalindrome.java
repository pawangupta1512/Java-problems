package operators;

import java.util.Scanner;

public class stringPalindrome {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.nextLine();
        String reverse = "";
        for (int i = s.length() - 1; i>=0; i--) {
            reverse = reverse + s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println(s + " is a Palindrome.");
        } else {
            System.out.println(s + "is Not Palindrome.");
        }
         sc.close();
    }
}
