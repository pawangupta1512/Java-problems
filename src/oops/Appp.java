package oops;

public class Appp {

    static class Student {
        private String name;
        private int marks;

        // setter
        public void setName(String name) {
            this.name = name;
        }

        // getter
        public String getName() {
            return name;
        }

        // setter with validation
        public void setMarks(int marks) {
            if (marks >= 0 && marks <= 100) {
                this.marks = marks;
            } else {
                System.out.println("Invalid marks");
            }
        }

        // getter
        public int getMarks() {
            return marks;
        }
    }

    // main method
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Pawan");
        s1.setMarks(85);

        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
    }
}