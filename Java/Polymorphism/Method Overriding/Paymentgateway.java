class Payment {
    void processPayment() {}
}

class CreditCardPayment extends Payment {
    void processPayment() {
        System.out.println("Processing Credit Card Payment");
    }
}

class DebitCardPayment extends Payment {
    void processPayment() {
        System.out.println("Processing Debit Card Payment");
    }
}

class NetBanking extends Payment {
    void processPayment() {
        System.out.println("Processing Net Banking");
    }
}

public class Paymentgateway {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.processPayment();

        p = new DebitCardPayment();
        p.processPayment();

        p = new NetBanking();
        p.processPayment();
    }
}
