package arrays;

public class printMatrix {
    public static void main(String[] args) {
        
        int[][] arr; 
        arr = new int[3][4];

        int[][] brr = {
                    {1, 2},
                    {2, 3},
                    {3, 4},
                    {4, 5}
        };

        int rowLength = brr.length;
        int colLength = brr[0].length;

        for(int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
            for(int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}
