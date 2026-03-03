import java.util.Scanner;

class Employee {
    String name;
    int empid;
    int basesalary;

    Employee(String name, int empid, int basesalary) {
        this.name = name;
        this.empid = empid;
        this.basesalary = basesalary;
    }
}

class Teamlead extends Employee {
    int teamsize;
    int leadershipbonus;

    Teamlead(String name, int empid, int basesalary,
             int teamsize, int leadershipbonus) {

        super(name, empid, basesalary);
        this.teamsize = teamsize;
        this.leadershipbonus = leadershipbonus;
    }
}

class Projectmanager extends Teamlead {
    String projectname;
    int projectbudget;

    Projectmanager(String name, int empid, int basesalary,
                   int teamsize, int leadershipbonus,
                   String projectname, int projectbudget) {

        super(name, empid, basesalary, teamsize, leadershipbonus);
        this.projectname = projectname;
        this.projectbudget = projectbudget;
    }
}

class Tech {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Base Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Team Size: ");
        int team = sc.nextInt();

        System.out.print("Enter Leadership Bonus: ");
        int bonus = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Project Name: ");
        String pname = sc.nextLine();

        System.out.print("Enter Project Budget: ");
        int budget = sc.nextInt();

        Projectmanager p = new Projectmanager(
                name, id, salary,
                team, bonus,
                pname, budget
        );

        System.out.println("\n------ DETAILS ------");
        System.out.println("Employee Name: " + p.name);
        System.out.println("Employee ID: " + p.empid);
        System.out.println("Base Salary: " + p.basesalary);
        System.out.println("Team Size: " + p.teamsize);
        System.out.println("Leadership Bonus: " + p.leadershipbonus);
        System.out.println("Project Name: " + p.projectname);
        System.out.println("Project Budget: " + p.projectbudget);

        sc.close();
    }
}