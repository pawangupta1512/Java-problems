package oops;

class Bank {
    int rateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    int rateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    @Override
    int rateOfInterest() {
        return 8;
    }
}
public class banks {
    public static void main(String[] args) {
         Bank b1 = new SBI();
         Bank b2 = new HDFC();

         System.out.println("SBI Interest: " + b1.rateOfInterest());
         System.out.println("HDFC Interest: " + b2.rateOfInterest());
    }
}
