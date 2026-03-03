import java.util.Scanner;
public class Manufacture{
String name; String status; String version;

public Manufacture(){
this.name="SG-Device";
this.status="inactive";
this.version="v1.0";
}

public Manufacture(String name, String version){
this.name=name;
this.version=version;
this.status="inactive";
}

public Manufacture(String name, String version, String status){
this.name=name;
this.version=version;
this.status=status;
}

public void display(){
System.out.println();
System.out.println("System name: "+name);
System.out.println("System version: "+version);
System.out.println("Status: "+status);
}

public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("SMART GADGETS DEVICE INITIALIZATION PROCESS");
System.out.println("1.Inital setup phase");
System.out.println("2.Testing phase");
System.out.println("3.Purchase phase");
System.out.println();
System.out.print("Enter the phase:");
int ph = input.nextInt();
if (ph==1){
Manufacture pro = new Manufacture();
pro.display();
}
else if (ph==2){
System.out.print("Enter the testing device name:");
input.nextLine();
String nm=input.nextLine();
System.out.print("Enter the testing version:");
String v=input.nextLine();
Manufacture pro = new Manufacture(nm,v);
pro.display();
}
else{
System.out.print("Enter the sales device name:");
input.nextLine();
String nm=input.nextLine();
System.out.print("Enter the sales version:");
String v=input.nextLine();
String s="active";
Manufacture pro = new Manufacture(nm,v,s);
pro.display();
}
}}