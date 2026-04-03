
class Bill {
    void calculateBill(double price) {
        System.out.println("Bill: " + price);
    }

    void calculateBill(double price, double tax) {
        System.out.println("Bill: " + (price + tax));
    }

    void calculateBill(double price, double tax, double service) {
        System.out.println("Bill: " + (price + tax + service));
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Bill b = new Bill();

        b.calculateBill(500);
        b.calculateBill(500, 50);
        b.calculateBill(500, 50, 30);
    }
}