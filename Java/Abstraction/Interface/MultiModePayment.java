import java.util.*;

interface PaymentService {
    void processPayment(double amount);
}

class CreditCard implements PaymentService {
    public void processPayment(double amount) {
        double charge = 50;
        double cashback = 0;

        if (amount > 5000)
            cashback = amount * 0.05;

        double finalAmount = amount + charge;

        System.out.println("Credit Card Payment");
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Cashback: " + cashback);
    }
}

class DebitCard implements PaymentService {
    public void processPayment(double amount) {
        double charge = 20;
        double cashback = 0;

        if (amount > 2000)
            cashback = amount * 0.02;

        double finalAmount = amount + charge;

        System.out.println("Debit Card Payment");
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Cashback: " + cashback);
    }
}

class UPI implements PaymentService {
    public void processPayment(double amount) {
        double cashback = 0;

        if (amount > 1000)
            cashback = 100;

        System.out.println("UPI Payment");
        System.out.println("Final Amount: " + amount);
        System.out.println("Cashback: " + cashback);
    }
}

public class MultiModePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment type (credit/debit/upi): ");
        String type = sc.nextLine();

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        PaymentService p;

        if (type.equalsIgnoreCase("credit"))
            p = new CreditCard();
        else if (type.equalsIgnoreCase("debit"))
            p = new DebitCard();
        else if (type.equalsIgnoreCase("upi"))
            p = new UPI();
        else {
            System.out.println("Invalid type");
            return;
        }

        p.processPayment(amt);
    }
}