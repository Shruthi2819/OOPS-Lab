import java.util.*;

class Discount {

    void calculateDiscount(double price) {
        System.out.println("Final Price: " + price);
    }

    void calculateDiscount(double price, double coupon) {
        System.out.println("Final Price: " + (price - coupon));
    }

    void calculateDiscount(double price, double coupon, double seasonal) {
        System.out.println("Final Price: " + (price - coupon - seasonal));
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Discount d = new Discount();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter coupon discount: ");
        double c = sc.nextDouble();

        System.out.print("Enter seasonal discount: ");
        double s = sc.nextDouble();

        d.calculateDiscount(price);
        d.calculateDiscount(price, c);
        d.calculateDiscount(price, c, s);
    }
}