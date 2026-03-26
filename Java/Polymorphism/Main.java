class Calculator{
public int add(int a,int b){
return a+b;
}
protected void display(){
System.out.println("Base display");
}
private void show(){
System.out.println("Private show in Calculator");
}
public void accessPrivate(){
show();
}
}

class AdvancedCalculator extends Calculator{
public int add(int a,int b){
return a+b+10;
}
protected void display(){
System.out.println("Advanced display");
}
public void show(){
System.out.println("Show in AdvancedCalculator");
}
}

public class Main{
public static void main(String[] args){
Calculator c=new Calculator();
c.display();
c.accessPrivate();
System.out.println(c.add(2,3));
AdvancedCalculator ac=new AdvancedCalculator();
ac.display();
ac.show();
System.out.println(ac.add(2,3));
Calculator ref=new AdvancedCalculator();
ref.display();
System.out.println(ref.add(5,5));
}
}