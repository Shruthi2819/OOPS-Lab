class ElectricityBill {
    private int units;  // Encapsulated data

    // Setter method with validation
    public void setUnits(int units) {
        if (units >= 0) {
            this.units = units;
        } else {
            System.out.println("Invalid Units");
        }
    }

    // Method to calculate bill
    public double calculateBill() {
        double bill = 0;

        if (units <= 100) {
            bill = units * 5;
        } 
        else if (units <= 200) {
            bill = (100 * 5) + (units - 100) * 7;
        } 
        else {
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }

        return bill;
    }
}

public class Electricity {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();

        eb.setUnits(250);  // Sample input

        double totalBill = eb.calculateBill();

        System.out.println("Total Bill: " + totalBill);
    }
}
