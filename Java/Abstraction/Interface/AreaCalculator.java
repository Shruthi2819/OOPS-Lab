import java.util.*;

interface Shape {
    double area();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        Shape c = new Circle(r);

        System.out.println("Circle Area: " + c.area());

        // Rectangle
        System.out.print("Enter length of the rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double b = sc.nextDouble();

        Shape rec = new Rectangle(l, b);

        System.out.println("Rectangle Area: " + rec.area());
    }
}