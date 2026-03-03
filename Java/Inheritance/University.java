import java.util.Scanner;

class Person {
    String name;
    String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public String getid() {
        return id;
    }
}

class Student extends Person {
    String dept;
    double cgpa;

    Student(String name, String id, String dept, double cgpa) {
        super(name, id);
        this.dept = dept;
        this.cgpa = cgpa;
    }

    public String getdept() {
        return dept;
    }

    public double getcgpa() {
        return cgpa;
    }
}

class Research extends Student {
    String topic;
    String guide;

    Research(String name, String id, String dept, double cgpa, String topic, String guide) {
        super(name, id, dept, cgpa);
        this.topic = topic;
        this.guide = guide;
    }

    public String gettopic() {
        return topic;
    }

    public String getguide() {
        return guide;
    }
}

class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();  

        System.out.print("Enter Research Topic: ");
        String topic = sc.nextLine();

        System.out.print("Enter Research Guide: ");
        String guide = sc.nextLine();

        Research r = new Research(name, id, dept, cgpa, topic, guide);

        System.out.println("\n--- DETAILS ---");
        System.out.println("NAME: " + r.getname());
        System.out.println("ID: " + r.getid());
        System.out.println("DEPARTMENT: " + r.getdept());
        System.out.println("CGPA: " + r.getcgpa());
        System.out.println("RESEARCH TOPIC: " + r.gettopic());
        System.out.println("RESEARCH GUIDE: " + r.getguide());

        sc.close();
    }
}