import java.util.*;

class GymMembership{
    private int daysRemaining;

    public void addDays(int days){
        if(days > 0)
            daysRemaining = days;
        else
            System.out.println("Invalid days to add");
    }

    public void useDays(int days){
        if (days <= daysRemaining) {
            daysRemaining -= days;
            System.out.println("Days used successfully");
        } else {
            System.out.println("Not enough membership days");
        }
    }

    public void getDays(){
        System.out.println("Remaining Days : " + daysRemaining);
    }
}

public class Gym{
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);

        GymMembership gm = new GymMembership();

        System.out.print("Enter no.of days to add : ");
        int day = sc.nextInt();

        System.out.print("Enter no.of days to use : ");
        int d = sc.nextInt();

        gm.addDays(day);
        gm.useDays(d);
        gm.getDays();
    }
}