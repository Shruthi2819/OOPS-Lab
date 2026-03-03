import java.util.Scanner;

class Transportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {
            System.out.println("\nApplicant " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();  // consume leftover newline

            System.out.print("Enter License Type (Car / Commercial / Motorcycle Learner): ");
            String type = sc.nextLine();

            System.out.println("Result for " + name + ":");

            if(type.equalsIgnoreCase("Car")) {
                if(age >= 18) {
                    System.out.println("Eligible for Car license");
                } else {
                    System.out.println("Not Eligible for Car license");
                }
            }
            else if(type.equalsIgnoreCase("Commercial")) {
                if(age >= 20) {
                    System.out.println("Eligible for Commercial Vehicle license");
                } else {
                    System.out.println("Not Eligible for Commercial Vehicle license");
                }
            }
            else if(type.equalsIgnoreCase("Motorcycle Learner")) {
                if(age >= 16) {
                    System.out.println("Eligible for Motorcycle Learner permit");
                } else {
                    System.out.println("Not Eligible for Motorcycle Learner permit");
                }
            }
            else {
                System.out.println("Invalid license category");
            }
        }

        sc.close();
    }
}