package patterns;

public class solidRectangle {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        for(int row = 1; row <= a; row++) {
            for(int col = 1; col <= b; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
