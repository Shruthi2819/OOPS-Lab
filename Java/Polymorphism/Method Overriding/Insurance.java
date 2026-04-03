
import java.util.*;

class Policy {
    void calculatePremium() {}
}

class HealthPolicy extends Policy {
    void calculatePremium() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Premium: " + (age * 100));
    }
}

class VehiclePolicy extends Policy {
    void calculatePremium() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle type: ");
        String type = sc.next();
        System.out.println("Premium based on vehicle: " + type);
    }
}

class LifePolicy extends Policy {
    void calculatePremium() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income: ");
        int inc = sc.nextInt();
        System.out.println("Premium: " + (inc * 0.05));
    }
}

public class Insurance {
    public static void main(String[] args) {
        Policy p;

        p = new HealthPolicy();
        p.calculatePremium();

        p = new VehiclePolicy();
        p.calculatePremium();

        p = new LifePolicy();
        p.calculatePremium();
    }
}