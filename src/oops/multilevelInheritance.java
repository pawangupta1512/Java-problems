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

class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy weeps");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}
