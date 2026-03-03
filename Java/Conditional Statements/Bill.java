import java.util.Scanner;

class Bill {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter the name: ");
            String name = input.nextLine();

            System.out.print("No. of calls: ");
            int call = input.nextInt();

            System.out.print("No. of sms: ");
            int msg = input.nextInt();

            System.out.print("Amount of Data in GB: ");
            int data = input.nextInt();

            double call_charge = 0.0, 
                   sms_charge = 0.0, 
                   data_charge = 0.0, 
                   total = 0.0, 
                   tax = 0.0;

            // Call Charges
            for (int j = 1; j <= call; j++) {

                if (j <= 50) {
                    continue;
                } 
                else if (j > 50 && j <= 150) {
                    call_charge += 1.0;
                } 
                else {
                    call_charge += 1.5;
                }
            }

            // SMS Charges
            for (int j = 1; j <= msg; j++) {

                if (j <= 100) {
                    sms_charge += 0.5;
                } 
                else {
                    break;
                }
            }

            // Data Charges
            for (int j = 1; j <= data; j++) {

                if (j > 1 && j <= 5) {
                    data_charge += 50;
                } 
                else if (j > 5) {
                    data_charge += 30;
                }
            }

            total = call_charge + sms_charge + data_charge;

            if (total > 500) {
                tax = 0.18 * total;
            }

            total += tax;

            System.out.println();
            System.out.println("BILL INVOICE");
            System.out.println("CALL CHARGES: " + call_charge);
            System.out.println("DATA CHARGES: " + data_charge);
            System.out.println("SMS CHARGES: " + sms_charge);
            System.out.println("SERVICE TAX: " + tax);
            System.out.println("TOTAL BILL: " + total);

            input.nextLine(); // Clear buffer
        }
    }
}