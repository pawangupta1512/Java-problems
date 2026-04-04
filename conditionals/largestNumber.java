package conditionals;

public class largestNumber {
    public static void main(String[] args) {

        int a = 10, b = 25, c = 15;

        if (a > b) {
            if (a > c) {
                System.out.println("A is largest");
            } else {
                System.out.println("C is largest");
            }
        } else {
            if (b > c) {
                System.out.println("B is largest");
            } else {
                System.out.println("C is largest");
            }
        }
    }
}
