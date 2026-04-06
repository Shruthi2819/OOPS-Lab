import java.util.*;

abstract class Patient {
    String name;
    double treatmentCost;

    abstract void calculateBill();

    void display(String name, double cost) {
        this.name = name;
        this.treatmentCost = cost;

        System.out.println("Patient Name: " + name);
        System.out.println("Treatment Cost: " + cost);
    }
}

class InsuredPatient extends Patient {
    void calculateBill() {
        double room = 2000;
        double total = treatmentCost + room;
        double insurance = total * 0.70;
        double payable = total - insurance;

        System.out.println("Room Charge: " + room);
        System.out.println("Total Bill: " + total);
        System.out.println("Insurance Covered: " + insurance);
        System.out.println("Final Payable: " + payable);
    }
}

class NonInsuredPatient extends Patient {
    void calculateBill() {
        double room = 2000;
        double total = treatmentCost + room;

        System.out.println("Room Charge: " + room);
        System.out.println("Total Bill: " + total);
        System.out.println("Final Payable: " + total);
    }
}

public class HospitalBilling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter type (insured/noninsured): ");
        String type = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter treatment cost: ");
        double cost = sc.nextDouble();

        if (cost <= 0) {
            System.out.println("Invalid cost!");
            return;
        }

        Patient p;

        if (type.equalsIgnoreCase("insured"))
            p = new InsuredPatient();
        else if (type.equalsIgnoreCase("noninsured"))
            p = new NonInsuredPatient();
        else {
            System.out.println("Invalid type!");
            return;
        }

        System.out.println("------ BILL DETAILS ------");
        p.display(name, cost);
        p.calculateBill();
    }
}