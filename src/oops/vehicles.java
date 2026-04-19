package oops;

class Vehicle {
    int speed = 60;

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    int speed = 100;

    void display() {
        System.out.println("Car speed: " + speed);
        System.out.println("Vehicle speed: " + super.speed);
    }
}
public class vehicles {
    public static void main(String[] args) {
        Car c = new Car();
        
        c.display();
        c.run();
    }
}
