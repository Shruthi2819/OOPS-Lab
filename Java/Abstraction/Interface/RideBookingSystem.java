import java.util.*;

interface RideService {
    void calculateFare(int distance, int time);
}

class BikeRide implements RideService {
    public void calculateFare(int distance, int time) {
        int fare = distance * 5;
        System.out.println("Total Fare : " + fare);
    }
}

class CabRide implements RideService {
    public void calculateFare(int distance, int time) {
        int fare = distance * 10;

        if (time > 10) {
            fare += 50;
            System.out.println("Surge pricing applied (+50)");
        }

        System.out.println("Total Fare : " + fare);
    }
}

public class RideBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RideService rs;

        System.out.print("Enter type (Bike / Cab) : ");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("bike")) {
            rs = new BikeRide();
        } 
        else if (type.equalsIgnoreCase("cab")) {
            rs = new CabRide();
        } 
        else {
            System.out.println("Invalid ride type!");
            return;
        }

        System.out.print("Enter Distance (km) : ");
        int dis = sc.nextInt();

        System.out.print("Enter time (min) : ");
        int time = sc.nextInt();

        System.out.println("----------- RIDE BOOKING SYSTEM ---------");
        System.out.println("Ride type : " + type);

        rs.calculateFare(dis, time);
    }
}