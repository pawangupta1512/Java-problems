package oops;

class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}
public class hierarchialInheritance {
    public static void main(String[] args) {
         Dog d = new Dog();
         Cat c = new Cat();

         d.eat();
         d.bark();

         c.eat();
         c.meow();
    }
}
