import java.util.*;

interface CourseEvaluator {
    void evaluate(int marks, int assignments);
}


class ProgrammingCourse implements CourseEvaluator {
    public void evaluate(int marks, int assignments) {
        int bonus = 0;

        if (assignments > 5) {
            bonus = 10;
        }

        int finalMarks = marks + bonus;

        System.out.println("Course Type: Programming");
        System.out.println("Original Marks: " + marks);
        System.out.println("Bonus Marks: " + bonus);
        System.out.println("Final Marks: " + finalMarks);

        // Pass/Fail
        if (finalMarks > 50)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");

        // Performance
        if (finalMarks >= 80)
            System.out.println("Performance: Excellent");
        else if (finalMarks >= 60)
            System.out.println("Performance: Good");
        else
            System.out.println("Performance: Average");
    }
}


class TheoryCourse implements CourseEvaluator {
    public void evaluate(int marks, int assignments) {
        int bonus = 0;

        if (assignments > 3) {
            bonus = 5;
        }

        int finalMarks = marks + bonus;

        System.out.println("Course Type: Theory");
        System.out.println("Original Marks: " + marks);
        System.out.println("Bonus Marks: " + bonus);
        System.out.println("Final Marks: " + finalMarks);

        // Pass/Fail
        if (finalMarks > 60)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");

        // Performance
        if (finalMarks >= 75)
            System.out.println("Performance: Excellent");
        else if (finalMarks >= 60)
            System.out.println("Performance: Good");
        else
            System.out.println("Performance: Average");
    }
}

public class CourseEvaluation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course type (programming/theory): ");
        String type = sc.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        System.out.print("Enter number of assignments: ");
        int assignments = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
            return;
        }

        if (assignments < 0) {
            System.out.println("Invalid assignments!");
            return;
        }

        CourseEvaluator ce;

        if (type.equalsIgnoreCase("programming")) {
            ce = new ProgrammingCourse();
        } 
        else if (type.equalsIgnoreCase("theory")) {
            ce = new TheoryCourse();
        } 
        else {
            System.out.println("Invalid course type!");
            return;
        }

        System.out.println("------ COURSE EVALUATION RESULT ------");
        ce.evaluate(marks, assignments);
    }
}