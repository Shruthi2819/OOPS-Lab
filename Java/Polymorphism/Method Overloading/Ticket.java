import java.util.*;

class Booking {
    void book(String movie){
        System.out.println("Booked " + movie + "for 1 seat");
    }

    void book(String movie, int seat){
        System.out.println("Movie :" + movie + "No of seats :" + seat);
    }

    void book(String movie, int seat , String showtime){
        System.out.println("Movie : " + movie + "No of seats :" + seat +  "Showtime :" + showtime);
    }
}

public class Ticket{
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        Booking b = new Booking();

        System.out.println("Enter movie:");
        String m = sc.nextLine();

        System.out.println("Enter seats : ");
        int s = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter showtime  :");
        String t = sc.nextLine();

       b. book(m);
       b. book(m,s);
       b.book(m,s,t);
    }
}
