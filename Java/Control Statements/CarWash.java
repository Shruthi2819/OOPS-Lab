import java.util.Scanner;

public class CarWash {

    String number;
    String name;
    String model;
    String colour;

    public CarWash(String number, String name, String model, String colour) {
        this.name = name;
        this.number = number;
        this.model = model;
        this.colour = colour;
    }

    public void ext() {
        System.out.println("Exterior Wash");
    }

    public void vac() {
        System.out.println("Interior Vacuum");
    }

    public void full() {
        System.out.println("Full Detail Service");
    }

    public void display() {
        System.out.println("OWNER NAME: " + name);
        System.out.println("CAR NUMBER: " + number);
        System.out.println("MODEL: " + model);
        System.out.println("COLOUR: " + colour);
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. Interior Vacuum");
        System.out.println("2. Exterior Wash");
        System.out.println("3. Full Detail Service");

        // Loop for 3 Cars
        for (int i = 1; i <= 3; i++) {

            System.out.println();
            System.out.println("Car " + i);

            System.out.print("Enter your choice: ");
            int ch = input.nextInt();
            input.nextLine();  // consume newline

            System.out.print("Enter the Owner Name: ");
            String nm = input.nextLine();

            System.out.print("Enter the Car Number: ");
            String num = input.nextLine();

            System.out.print("Enter the Model: ");
            String mod = input.nextLine();

            System.out.print("Enter the Colour: ");
            String col = input.nextLine();

            CarWash car = new CarWash(num, nm, mod, col);
            car.display();

            switch (ch) {
                case 1:
                    car.vac();
                    break;
                case 2:
                    car.ext();
                    break;
                case 3:
                    car.full();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }

        input.close();
    }
}