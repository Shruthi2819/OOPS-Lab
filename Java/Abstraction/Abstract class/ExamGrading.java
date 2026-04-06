import java.util.*;

abstract class Exam{
    abstract void calculateGrade(int marks);
}

class SchoolExam extends Exam{
    void calculateGrade(int marks) {
        if (marks > 90) System.out.println("Grade A");
        else System.out.println("Grade B");
    }
}

class CollegeExam extends Exam {
    void calculateGrade(int marks) {
        if (marks > 75) System.out.println("Grade A");
        else System.out.println("Grade C");
    }
}

public class ExamGrading{
    public static void main(String  [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter type (school/college) :");
        String type = sc.nextLine();

        System.out.print("Enter marks : ");
        int mark = sc.nextInt();
        sc.nextLine();

        Exam e;

        if(type.equalsIgnoreCase("school")){
            e = new SchoolExam();
        }
        else{
            e = new CollegeExam();
        }

        e.calculateGrade(mark);
    }
}