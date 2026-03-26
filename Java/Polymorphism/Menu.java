class Calculator{

public int add(int a , int b){
return a+b;
}

protected int add(int a , int b , int c){
return a + b + c;
}

private double add(double a , double b){
return a + b;
}

public void Addition(double a, double b) {
double result = add(a, b);
System.out.println("Decimal Sum: " + result);
}
}

public class Menu{
public static void main(String[] ags){
Calculator c = new Calculator();
System.out.println("Sum of 2 integers :" + c.add(2,3));
System.out.println("Sum of 3 integers :" + c.add(2,3,4));
c.Addition(2.5 , 3.5);
}
}










