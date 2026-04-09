import java.util.Scanner;

class Parking {
    private int totalSlots;
    private int filledSlots = 0;

    public void setSlots(int total) {
        totalSlots = total;
    }

    public void parkVehicle(int count) {
        if (filledSlots + count <= totalSlots) {
            filledSlots = filledSlots + count;
        } else {
            System.out.println("Parking Full");
        }
    }

    public void removeVehicle(int count) {
        if (count <= filledSlots) {
            filledSlots = filledSlots - count;
        } else {
            System.out.println("Invalid number of vehicles");
        }
    }

    public int getAvailableSlots() {
        return totalSlots - filledSlots;
    }
}

public class SmartParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parking p = new Parking();

        System.out.print("Enter total slots: ");
        int total = sc.nextInt();
        p.setSlots(total);

        System.out.print("Enter cars entering: ");
        int enter = sc.nextInt();
        p.parkVehicle(enter);

        System.out.print("Enter cars leaving: ");
        int leave = sc.nextInt();
        p.removeVehicle(leave);

        System.out.println("Available slots: " + p.getAvailableSlots());
    }
}