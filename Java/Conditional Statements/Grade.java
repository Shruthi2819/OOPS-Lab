import java.util.Scanner;

class Grade {

    public static void main(String args[]) {

        int o = 0, e = 0, g = 0, s = 0, n = 0;
        double total = 0.0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {

            System.out.println();
            input.nextLine();

            System.out.print("Enter the name: ");
            String name = input.nextLine();

            System.out.print("Enter the marks: ");
            double mark = input.nextDouble();

            total += mark;

            if (90 <= mark && mark <= 100) {

                System.out.println("GRADE: OUTSTANDING");

                if (mark == 100) {
                    System.out.println("Perfect Scorer!!");
                }

                o += 1;
            } 
            else if (75 <= mark && mark <= 89) {

                System.out.println("GRADE: EXCELLENT");
                e += 1;
            } 
            else if (60 <= mark && mark <= 74) {

                System.out.println("GRADE: GOOD");
                g += 1;
            } 
            else if (45 <= mark && mark <= 59) {

                System.out.println("GRADE: SATISFACTORY");
                s += 1;
            } 
            else if (mark < 45) {

                System.out.println("GRADE: NEEDS IMPROVEMENT");
                n += 1;
            }
        }

        System.out.println();
        System.out.println("No.of Students in Outstanding grade: " + o);
        System.out.println("No.of Students in Excellent grade: " + e);
        System.out.println("No.of Students in Good grade: " + g);
        System.out.println("No.of Students in Satisfactory grade: " + s);
        System.out.println("No.of Students in Needs improvement grade: " + n);

        System.out.println();
        System.out.println("Average: " + total / 6);
    }
}