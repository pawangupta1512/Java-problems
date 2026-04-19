package oops;

class Employee {
    int salary = 35000;

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int bonus = 10000;

    void totalSalary() {
        int total = salary + bonus;
        System.out.println("Total salary (with bonus): " + total);
    }
}
public class employeee {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.displaySalary();
        m.totalSalary();
    }
}
