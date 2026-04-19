package oops;

class Person {
    int marks1 = 87;
    int marks2 = 76;
    int marks3 = 90;

    void marks() {
        System.out.println("Marks in subject 1: " + marks1);
        System.out.println("Marks in subject 2: " + marks2);
        System.out.println("Marks in subject 3: " + marks3);
    }
}

class Student extends Person {
    String name = "Pawan";
    int rollNo = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
    }
}
public class persons {
    public static void main(String[] args) {
        Student s = new Student();

        s.marks();;
        s.display();
    }
}
