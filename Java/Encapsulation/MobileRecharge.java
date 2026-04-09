import java.util.*;

class Recharge{
    private double balance = 0;

    public void recharge(double amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("Invalid");
        }
    }

    public void makeCall(int minutes){
        balance -= minutes;

        if (minutes > balance){
            System.out.println("Insufficient Balance !");
        }
        else{
            balance -= minutes;
        }
    }

    public void getBalance(){
        System.out.println("Balance  : " + balance);
    }
}

public class MobileRecharge{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Recharge r = new Recharge();

        System.out.print("Enter Amount :");
        double amt = sc.nextDouble();

        System.out.print("Enter no of Minutes :");
        int min = sc.nextInt();

        r.recharge(amt);
        r.makeCall(min);
        r.getBalance();
    }
}