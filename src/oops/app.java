package oops;

class Car {
    String brand;
    int speed;

    void show() {
        System.out.println(brand + " " + speed);
    }
}
public class app {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "Audi";
        c1.speed = 350;

        c1.show();
    }
}
