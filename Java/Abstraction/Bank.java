import java.util.*;

abstract class BankAccount{
    protected double balance;

    abstract void deposit(double amount);

    abstract void withdrawal(double amount);

    public void displaybalance(){
        System.out.println("Balance Amount : " + balance);
    }
}

class SavingsAccount extends BankAccount{
    void deposit(double amount){
        balance += amount;
    }

    void withdrawal(double amount){
        if (amount <= balance){balance -= amount;}
        else{System.out.println("Amount not sufficient to withdraw!!");}
    }
}

public class Bank{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        SavingsAccount s = new SavingsAccount();

        System.out.print("Enter deposit amount : ");
        double dep = sc . nextDouble();
        sc.nextLine();

        System.out.print("Enter withdrawal amount : ");
        double wd = sc.nextDouble();
        sc.nextLine();

        s.deposit(dep);
        s.withdrawal(wd);
        s.displaybalance();
    }
}