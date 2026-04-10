package patterns;

public class solidPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row <= n; row++) {

            // for spaces
            for(int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // for stars
            for(int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
