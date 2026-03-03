import java.util.Scanner;

class Screening {
    String moviename;
    int screennumber;
    int availableseats;
    double showtime;   // changed to double

    // Constructor
    Screening(String moviename, int screennumber, int availableseats, double showtime) {
        this.moviename = moviename;
        this.screennumber = screennumber;
        this.availableseats = availableseats;
        this.showtime = showtime;
    }

    // Booking
    void book(int tickets) {
        if (tickets <= availableseats) {
            availableseats -= tickets;
            System.out.println("Tickets booked successfully!");
        } else {
            System.out.println("Seats sold out!!!");
        }
    }

    // Cancellation
    void cancel(int tickets) {
        availableseats += tickets;
        System.out.println("Successfully cancelled tickets!!");
    }

    // Display movie info
    void display() {
        System.out.println("Screen No : " + screennumber + 
                           " | Movie Name : " + moviename);
    }
}

public class Cinema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Screening screen1 = new Screening("Titanic", 1, 100, 3.0);
        System.out.println();
        Screening screen2 = new Screening("Angel", 2, 100, 2.5);

        System.out.println("Welcome to CineNova!");
        System.out.println("Available Movies:");
        screen1.display();
        screen2.display();

        // Choosing Screen
        System.out.print("Enter Screen No (1 or 2) : ");
        int choice = sc.nextInt();

        // Booking
        System.out.print("Enter number of tickets to book: ");
        int book = sc.nextInt();

        // Cancellation
        System.out.print("Enter number of tickets to cancel: ");
        int cancel = sc.nextInt();

        if (choice == 1) {
            screen1.book(book);
            screen1.cancel(cancel);
        } 
        else if (choice == 2) {
            screen2.book(book);
            screen2.cancel(cancel);
        } 
        else {
            System.out.println("Invalid Screen Number!");
        }

        sc.close();
    }
}

