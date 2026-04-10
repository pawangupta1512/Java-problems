package patterns;

public class invertedPyramid {
    public static void main(String[] args) {
        
        int n = 5;
        for(int row = 1; row <= n; row++) {

            // for spaces
            for(int col = 1; col <= row - 1; col++ ) {
                System.out.print(" ");
            }
            // for stars
            for(int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
