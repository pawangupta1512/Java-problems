package arrays;

public class sumOfValue {
    public static void main(String[] args) {
        
        int arr[] = {2,3,4,5};
        int ans = 0;
        int n = arr.length;

        for(int i = 0; i <= n - 1; i++) {
            int value = arr[i];
            ans += value;
        }
        System.out.println(ans);

    }
}
