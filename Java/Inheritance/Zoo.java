import java.util.Scanner;

class Animal {
    String name;
    int age;
    String diet;

    Animal(String name, int age, String diet) {
        this.name = name;
        this.age = age;
        this.diet = diet;
    }

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Mammal extends Animal {
    String furcolor;

    Mammal(String name, int age, String diet, String furcolor) {
        super(name, age, diet);
        this.furcolor = furcolor;
    }

    void run() {
        System.out.println("Running");
    }
}

class Bird extends Animal {
    int wingspan;

    Bird(String name, int age, String diet, int wingspan) {
        super(name, age, diet);
        this.wingspan = wingspan;
    }

    void fly() {
        System.out.println("Flying");
    }
}

class Reptile extends Animal {
    String venom;

    Reptile(String name, int age, String diet, String venom) {
        super(name, age, diet);
        this.venom = venom;
    }

    void crawl() {
        System.out.println("Crawling");
    }
}

public class Zoo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Animal Type:");
        System.out.println("1. Mammal");
        System.out.println("2. Bird");
        System.out.println("3. Reptile");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Diet: ");
        String diet = sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Fur Color: ");
            String fur = sc.nextLine();

            Mammal m = new Mammal(name, age, diet, fur);

            System.out.println("\n--- Details ---");
            System.out.println("Name: " + m.name);
            System.out.println("Age: " + m.age);
            System.out.println("Diet: " + m.diet);
            System.out.println("Fur Color: " + m.furcolor);
            m.eat();
            m.sleep();
            m.run();
        }

        else if (choice == 2) {

            System.out.print("Enter Wingspan: ");
            int wing = sc.nextInt();

            Bird b = new Bird(name, age, diet, wing);

            System.out.println("\n--- Details ---");
            System.out.println("Name: " + b.name);
            System.out.println("Age: " + b.age);
            System.out.println("Diet: " + b.diet);
            System.out.println("Wingspan: " + b.wingspan);
            b.eat();
            b.sleep();
            b.fly();
        }

        else if (choice == 3) {

            System.out.print("Enter Venom (Yes/No): ");
            String venom = sc.nextLine();

            Reptile r = new Reptile(name, age, diet, venom);

            System.out.println("\n--- Details ---");
            System.out.println("Name: " + r.name);
            System.out.println("Age: " + r.age);
            System.out.println("Diet: " + r.diet);
            System.out.println("Venomous: " + r.venom);
            r.eat();
            r.sleep();
            r.crawl();
        }

        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}


