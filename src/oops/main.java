package oops;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " " + age);
    }
}
public class main {

    public static void main(String[] args) {

        Student s1 = new Student(" Pawan ", 20);
        s1.display();
        s1 = null;
    }
}