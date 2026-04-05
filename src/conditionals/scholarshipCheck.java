package conditionals;

public class scholarshipCheck {
    public static void main(String[] args) {

        int marks = 82;
        int attendance = 85;
        int income = 250000;

        if (marks >= 75) {
            if (attendance >= 80) {
                if (income < 200000) {
                    System.out.println("Full Scholarship");
                } else if (income <= 500000) {
                    System.out.println("Half Scholarship");
                } else {
                    System.out.println("No Scholarship (High Income)");
                }
            } else {
                System.out.println("Not eligible (Low Attendance)");
            }
        } else {
            System.out.println("Not eligible (Low Marks)");
        }
    }
}
