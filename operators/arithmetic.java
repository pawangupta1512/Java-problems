package operators;

public class arithmetic {
    public static void main(String[] args) {
        
    int solvedThisWeek = 30;
    int solvedLastWeek = 25;

    int total = solvedThisWeek + solvedLastWeek;
    int diff = solvedThisWeek - solvedLastWeek;
    int projected = solvedThisWeek * solvedLastWeek;
    int remainder = solvedThisWeek % 7;

    System.out.println(total);
    System.out.println(diff);
    System.out.println(projected);
    System.out.print(remainder);
    
    }
}
