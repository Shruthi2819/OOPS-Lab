import java.util.Scanner;

public class Student {

    String name;
    int roll_no;
    String course;
    static int rollCounter = 101;

    // Default Constructor
    Student() {
        name = "Unassigned";
        roll_no = 0;
        course = "General";
    }

    // Parameterized Constructor
    Student(String name, String course) {
        this.name = name;
        this.roll_no = rollCounter++;
        this.course = course;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.roll_no = rollCounter++;
        this.course = s.course;
    }

    void display() {
        System.out.println("\n----- STUDENT DETAILS -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student enrolledStudent = null;

        while (true) {

            System.out.println("\nEduTrack Enrollment System");
            System.out.println("1. Display Default Student");
            System.out.println("2. Enroll New Student");
            System.out.println("3. Branch Transfer (Copy Student)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {

                case 1:
                    Student s1 = new Student();
                    s1.display();
                    break;

                case 2:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    enrolledStudent = new Student(name, course);
                    enrolledStudent.display();
                    break;

                case 3:
                    if (enrolledStudent != null) {
                        Student copied = new Student(enrolledStudent);
                        copied.display();
                    } else {
                        System.out.println("No student record available to copy!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}