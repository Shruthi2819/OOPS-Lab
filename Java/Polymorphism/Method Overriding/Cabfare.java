class Cab {
    void calculateFare() {}
}

class MiniCab extends Cab {
    void calculateFare() {
        System.out.println("Fare: 100 + 10/km");
    }
}

class Sedan extends Cab {
    void calculateFare() {
        System.out.println("Fare: 150 + 12/km");
    }
}

class SUV extends Cab {
    void calculateFare() {
        System.out.println("Fare: 200 + 15/km");
    }
}

public class Cabfare {
    public static void main(String[] args) {
        Cab c;

        c = new MiniCab();
        c.calculateFare();

        c = new Sedan();
        c.calculateFare();

        c = new SUV();
        c.calculateFare();
    }
}