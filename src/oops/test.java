package oops;

class Car {
    String brand;
    int speed;
    double price;

    Car(String b, int s, double p) {
        brand = b;
        speed = s;
        price = p;
    }
    
    void show() {
        System.out.println(brand + " " + speed + " " + price);
    }
}
public class test {
    public static void main(String[] args) {
        
        Car c1 = new Car("BMW", 250, 20000000);
        Car c2 = new Car("Tesla", 200, 10000000);

        c1.show();
        c2.show();
    }
}
