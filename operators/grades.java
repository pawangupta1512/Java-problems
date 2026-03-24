package operators;

import java.util.Scanner;

public class grades {
     public static void checkGrade(int num) {
        if (num >= 91 && num <=100) {
            System.out.print("grade: A+");
        } 
        else if (num >= 81) {
            System.out.print("grade: A");
        }
        else if (num >= 71) {
            System.out.print("grade: B+");
    }
    else if (num >= 61) {
            System.out.print("grade: B");
}
    else if (num >= 51) {
            System.out.print("grade: C+");
    }
    else if (num >= 41) {
            System.out.print("grade: D");
    } 
    else if (num <= 40) {
        System.out.println("fail");
    }
    else {
        System.out.println("invalid number.");
    }
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter marks out of 100: ");
    int marks = sc.nextInt();

    checkGrade(marks);
    sc.close();
}
}
