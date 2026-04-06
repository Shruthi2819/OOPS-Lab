import java.util.*;

abstract class LibraryUser {
    String name;
    int daysLate;

    abstract void calculateFine();

    void displayUser(String name, int daysLate) {
        this.name = name;
        this.daysLate = daysLate;

        System.out.println("Name : " + name);
        System.out.println("Days Late : " + daysLate);
    }
}

class Student extends LibraryUser {
    void calculateFine() {
        System.out.println("Fine Amount : " + (daysLate * 2));
    }
}

class Faculty extends LibraryUser {
    void calculateFine() {
        System.out.println("Fine Amount : " + (daysLate * 1));
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryUser l;   

        System.out.print("Enter Name : ");
        String n = sc.nextLine();

        System.out.print("Enter no.of.dayslate : ");
        int d = sc.nextInt();

        System.out.println("Choose the type: ");
        System.out.println("1. Student");
        System.out.println("2. Faculty");
        int choice = sc.nextInt();

        if (choice == 1) {
            l = new Student();
        } else {
            l = new Faculty();
        }

        
        l.displayUser(n, d);
        l.calculateFine();
    }
}