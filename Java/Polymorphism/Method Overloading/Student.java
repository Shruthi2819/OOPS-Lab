class Evaluation {
    void evaluate(int marks) {
        System.out.println("Marks: " + marks);
    }

    void evaluate(int marks, int attendance) {
        System.out.println("Total: " + (marks + attendance));
    }

    void evaluate(int marks, int attendance, int project) {
        System.out.println("Total: " + (marks + attendance + project));
    }
}

public class Student {
    public static void main(String[] args) {
        Evaluation e = new Evaluation();

        e.evaluate(80);
        e.evaluate(80, 10);
        e.evaluate(80, 10, 15);
    }
}