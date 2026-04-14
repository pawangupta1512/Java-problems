package arrays;

public class matrixTraversal {


    public static void main(String[] args) {
        
        int[][] arr; 
        arr = new int[3][4];

        int[][] brr = {
                    {1, 2},
                    {2, 3, 5},
                    {3, 4, 6, 9},
                    {4, 5, 3, 1}
        };

        for(int rowIndex = 0; rowIndex <= brr.length - 1; rowIndex++) {
            for(int colIndex = 0; colIndex <= brr[rowIndex].length - 1; colIndex++) {
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}
