package oops;

abstract class Shape {
    String color;
    Shape(String color) {
        this.color = color;
    }

    abstract double area();

    void displayColor() {
        System.out.println("color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    double area() {
        return 3.14 * radius * radius;

    }
}
public class shapes {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);

        c.displayColor();
        System.out.println("area: " + c.area());
    }
}
