import java.util.*;

abstract class Ride{
    abstract void calculateFare(int distance);
}

class Auto extends Ride{
    void calculateFare(int distance){
        System.out.println("Fare : " + distance * 10);
    }
}

class Cab extends Ride{
    void calculateFare(int distance){
        System.out.println("Fare : " + distance * 20);
    }
}

public class RideFareSystem{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Ride r;

        System.out.print("Enter type (Auto/Cab) :");
        String type = sc.nextLine();

        System.out.print("Enter total distance (km) :");
        int dis = sc.nextInt();
        sc.nextLine();

        if(type.equalsIgnoreCase("auto")){
            r = new Auto();
        }
        else{
            r = new Cab();
        }

        r.calculateFare(dis);
    }
}