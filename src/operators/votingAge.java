package operators;

import java.util.Scanner;

public class votingAge {
    public static void voteOrNot(int a) {
        if (a >= 18) {
            System.out.println("can vote");
        } else {
            System.out.println("cannot vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age: ");
        int age = sc.nextInt();

        voteOrNot(age);
        sc.close();
    }
}
