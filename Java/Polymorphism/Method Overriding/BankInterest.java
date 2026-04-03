class Interest{
    void calculateInterest(){
        System.out.println("Interest Calculation :");
    }
}

class SavingsAccount extends Interest {
    void calculateInterest(){
        System.out.println("Interest based on balance.");
    }
}

class CurrentAccount extends Interest {
    void calculateInterest(){
        System.out.println(" No Interest.");
    }
}

class FixedDeposit extends Interest {
    void calculateInterest(){
        System.out.println(" Higher interest based on years.");
    }
}

public class BankInterest{
    public static void main(String [] args){
        Interest i;

        i = new SavingsAccount();
        i.calculateInterest();

        i = new CurrentAccount();
        i.calculateInterest();

        i = new FixedDeposit();
        i.calculateInterest();
    }
}
