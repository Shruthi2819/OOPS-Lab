import java.util.Scanner;

class Vehicle {
    int regno;
    String fueltype;
    int maxspeed;

    Vehicle(int regno, String fueltype, int maxspeed) {
        this.regno = regno;
        this.fueltype = fueltype;
        this.maxspeed = maxspeed;
    }

    void start() {
        System.out.println("Vehicle starts!!");
    }

    void stop() {
        System.out.println("Vehicle stops!!");
    }
}

class Bus extends Vehicle {
    int passengercapacity;
    int routecapacity;

    Bus(int regno, String fueltype, int maxspeed,
        int passengercapacity, int routecapacity) {

        super(regno, fueltype, maxspeed);
        this.passengercapacity = passengercapacity;
        this.routecapacity = routecapacity;
    }
}

class Truck extends Vehicle {
    int cargolimit;
    int loadcapability;

    Truck(int regno, String fueltype, int maxspeed,
          int cargolimit, int loadcapability) {

        super(regno, fueltype, maxspeed);
        this.cargolimit = cargolimit;
        this.loadcapability = loadcapability;
    }
}

class Van extends Vehicle {
    String support;
    String accommodation;

    Van(int regno, String fueltype, int maxspeed,
        String support, String accommodation) {

        super(regno, fueltype, maxspeed);
        this.support = support;
        this.accommodation = accommodation;
    }
}

class Transport {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Bus");
        System.out.println("2. Truck");
        System.out.println("3. Van");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Registration No: ");
        int reg = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuel = sc.nextLine();

        System.out.print("Enter Max Speed: ");
        int speed = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Passenger Capacity: ");
            int pass = sc.nextInt();

            System.out.print("Enter Route Capacity: ");
            int route = sc.nextInt();

            Bus b = new Bus(reg, fuel, speed, pass, route);

            System.out.println("\n--- BUS DETAILS ---");
            System.out.println("Reg No: " + b.regno);
            System.out.println("Fuel Type: " + b.fueltype);
            System.out.println("Max Speed: " + b.maxspeed);
            System.out.println("Passenger Capacity: " + b.passengercapacity);
            System.out.println("Route Capacity: " + b.routecapacity);
            b.start();
            b.stop();
        }

        else if (choice == 2) {

            System.out.print("Enter Cargo Limit: ");
            int cargo = sc.nextInt();

            System.out.print("Enter Load Capability: ");
            int load = sc.nextInt();

            Truck t = new Truck(reg, fuel, speed, cargo, load);

            System.out.println("\n--- TRUCK DETAILS ---");
            System.out.println("Reg No: " + t.regno);
            System.out.println("Fuel Type: " + t.fueltype);
            System.out.println("Max Speed: " + t.maxspeed);
            System.out.println("Cargo Limit: " + t.cargolimit);
            System.out.println("Load Capability: " + t.loadcapability);
            t.start();
            t.stop();
        }

        else if (choice == 3) {

            System.out.print("Supports Refrigeration (Yes/No): ");
            String sup = sc.nextLine();

            System.out.print("Enter Accommodation Type: ");
            String acc = sc.nextLine();

            Van v = new Van(reg, fuel, speed, sup, acc);

            System.out.println("\n--- VAN DETAILS ---");
            System.out.println("Reg No: " + v.regno);
            System.out.println("Fuel Type: " + v.fueltype);
            System.out.println("Max Speed: " + v.maxspeed);
            System.out.println("Supports Refrigeration: " + v.support);
            System.out.println("Accommodation: " + v.accommodation);
            v.start();
            v.stop();
        }

        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}