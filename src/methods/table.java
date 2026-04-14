package methods;

public class table {
    static void printTable() {
        for(int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }
    static void main() {
        printTable();
    }
}
