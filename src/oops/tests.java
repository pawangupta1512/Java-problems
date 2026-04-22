package oops;

abstract class Animal {
    abstract void sound();

    void eat(){
    System.out.print("Animal eats food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class tests {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
