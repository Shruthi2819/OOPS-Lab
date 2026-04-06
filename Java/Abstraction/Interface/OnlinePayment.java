import java.util.*;

interface Payment{
    void pay(double amount);
}

class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Paid : " + (amount + 50));
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid: " + amount);
    }
}

public class OnlinePayment{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Payment p ;

        System.out.print("Enter type of Payment (CreditCard / UPI) :");
        String type = sc.nextLine();

        System.out.print("Enter amount :");
        double amt = sc.nextDouble();

        if(type.equalsIgnoreCase("creditcard")){
            p = new CreditCard();
        }
        else{
            p = new UPI();
        }

        p.pay(amt);
    }
}