package typecasting;

public class problem3 {
     public static void main(String[] args) {
        int a = 5, b = 10;

        a = a + b;
        b = a - b;
        a = a - b;   // swap variable without extra variable
        System.out.println(a + " " + b);
    }
}
