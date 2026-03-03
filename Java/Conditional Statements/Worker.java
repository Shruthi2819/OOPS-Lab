import java.util.Scanner;

class Worker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, department;
        double salary, bonus = 0;
        int experience;

        System.out.print("Enter worker name: ");
        name = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter years of experience: ");
        experience = sc.nextInt();
        sc.nextLine();  // clear buffer

        System.out.print("Enter department: ");
        department = sc.nextLine();

        // Bonus calculation based on experience
        if (experience < 2) {
            bonus = 0;
        } 
        else if (experience >= 2 && experience <= 5) {
            bonus = salary * 0.10;
        } 
        else if (experience > 5 && experience <= 10) {
            bonus = salary * 0.20;
        } 
        else if (experience > 10) {
            bonus = salary * 0.35;
        }

        // Extra ₹5000 for Hazardous department
        if (department.equalsIgnoreCase("Hazardous")) {
            bonus = bonus + 5000;
        }

        System.out.println("\n----- Bonus Details -----");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Final Bonus Amount: ₹" + bonus);

        sc.close();
    }
}