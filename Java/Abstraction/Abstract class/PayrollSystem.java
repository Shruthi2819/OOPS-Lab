import java.util.*;

abstract class Employee{
    String name;
    double baseSalary;

    abstract void calculateSalary();

    void display(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;

        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class FulltimeEmployee extends Employee{
    double bonus;
    double tax;
    double NetSalary;

    public void calculateSalary(){
         bonus = 0.2 * baseSalary;
         tax = 0.1 * baseSalary;
         NetSalary = baseSalary + bonus - tax;

         System.out.println("Bonus : " + bonus);
         System.out.println("Tax : " + tax);
         System.out.println("Salary : " + NetSalary);

    }

}

class ParttimeEmployee extends Employee{
    double bonus;
    double tax;
    double NetSalary;

    public void calculateSalary(){

        bonus = 0.1 * baseSalary;
        tax = 0.05 * baseSalary;
        NetSalary = baseSalary + bonus - tax;

        System.out.println("Bonus : " + bonus);
        System.out.println("Tax : " + tax);
        System.out.println("Salary : " + NetSalary);
    }

}

public class PayrollSystem{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Employee e;

        System.out.print("Enter Employee Type (FullTime / PartTime) :");
        String type = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Base Salary: ");
        double salary = sc.nextDouble();


        if(type.equalsIgnoreCase("fulltime")){
            e = new FulltimeEmployee();
        }
        else{
            e = new ParttimeEmployee();
        }

        System.out.println("-----------Details-----------");
        e.display(name , salary);
        e.calculateSalary();

    }
}
