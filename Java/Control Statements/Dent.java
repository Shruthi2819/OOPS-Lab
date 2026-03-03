import java.util.Scanner;

class Patient {
    int id;
    String name;
    String contactnumber;
    String procedure;

    Patient(int id, String name, String contactnumber, String procedure) {
        this.id = id;
        this.name = name;
        this.contactnumber = contactnumber;
        this.procedure = procedure;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactnumber);
        System.out.println("Procedure: " + procedure);

        if (procedure.equalsIgnoreCase("cleaning")) {
            System.out.println("Cost: Rs.500");
        } 
        else if (procedure.equalsIgnoreCase("filling")) {
            System.out.println("Cost: Rs.1500");
        } 
        else if (procedure.equalsIgnoreCase("extraction")) {
            System.out.println("Cost: Rs.2000");
        } 
        else if (procedure.equalsIgnoreCase("rootcanal")) {
            System.out.println("Cost: Rs.8000");
        } 
        else {
            System.out.println("Invalid Procedure");
        }
    }
}

public class Dent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
         
        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Contact Number: ");
        String contactnumber = sc.next();

        System.out.print("Enter Procedure (cleaning, filling, extraction, rootcanal): ");
        String procedure = sc.next();

        Patient p = new Patient(id, name, contactnumber, procedure);
        p.display();

        sc.close();
    }
}