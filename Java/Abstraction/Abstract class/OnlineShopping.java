import java.util.*;

abstract class Product{
    double price;

    Product(double price){
        this.price = price;
    }

    abstract void calculateDiscount();
}

class Electronics extends Product{
    Electronics(double price){
        super(price);
    }

    void calculateDiscount(){
        double finalPrice = price - (price * 0.10);
        System.out.println("Final Price: " + finalPrice);
    }
}

class Clothing extends Product{
    Clothing(double price){
        super(price);
    }

    void calculateDiscount(){
        double finalPrice = price - (price * 0.20);
        System.out.println("Final Price: " + finalPrice);
 }
}
public class OnlineShopping{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Product p;

        System.out.println("Choose Product type :");
        System.out.print("1.Electronics");
        System.out.print("2.Clothing");
        int choice = sc.nextInt();

        System.out.print("Enter the price : ");
        double pr = sc.nextDouble();

        if(choice == 1){
            p = new Electronics(pr);
        }
        else{
            p = new Clothing(pr);
        }

        p.calculateDiscount();
    }
}