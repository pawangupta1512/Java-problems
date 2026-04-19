package oops;

class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}
public class singleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
