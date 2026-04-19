package oops;

class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

int add(int a, int b, int c) {
    return a + b + c;
}
}
public class maths {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();

        System.out.println(m.add(2, 4));
        System.out.println(m.add(7, 6, 5));
    }
}
