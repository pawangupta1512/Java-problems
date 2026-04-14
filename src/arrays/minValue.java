package arrays;

public class minValue {
    public static void main(String[] args) {
        int arr[] = {99, 45, -87, 45, -1};
        int n = arr.length;
        int minValue = arr[0];

        for(int i = 0; i <= n - 1; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Min Value: " + minValue);
    }
}
