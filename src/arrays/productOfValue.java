package arrays;

public class productOfValue {
    public static void main(String[] args) {
        
        int arr[] = {3, 5, 7, 9};
        int ans = 1;
        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            int value = arr[i];
            ans *= value;
        }
        System.out.println("Product of array elements: " + ans);
    }
}
