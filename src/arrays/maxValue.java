package arrays;

public class maxValue {
    public static void main(String[] args) {
        
        int arr[] = {3, 4, 6, 78, 90, -45};
        int n = arr.length;
        int maxValue = arr[0];

        for(int i = 0; i <= n - 1; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("Max value is: " + maxValue);
    }
}
