//ROYAL STAY RESERVATION SYSTEM
import java.util.Scanner;
class Reservation{
String name; String room_type; String floor; double amount;

public Reservation(){
this.name="walk-in customer";
this.room_type="standard";
this.floor="G";
this.amount=2000.0;
}

public Reservation(String name, String room_type, String floor, double amount){
this.name=name;
this.room_type=room_type;
this.floor=floor;
this.amount=amount;
}

public Reservation(Reservation r, String newname){
this.name=newname;
this.room_type=r.room_type;
this.floor=r.floor;
this.amount=r.amount;
}

public void display(){
System.out.println();
System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("                           BOOKING DETAILS");
System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("Name: "+name);
System.out.println("Room type: "+room_type);
System.out.println("Floor: "+floor);
System.out.println("Amount: "+amount);
System.out.println();
}

public static void main(String args[]){
Scanner input = new Scanner(System.in);

System.out.println("1: Walk-in guest booking");
System.out.println("2: Advanced booking");

System.out.print("Enter the type of booking(1/2):");
int ch = input.nextInt();

if (ch==1){
Reservation walk=new Reservation();
walk.display();}

else if (ch==2){
System.out.print("Enter the name:");
input.nextLine();
String nm=input.nextLine();
System.out.print("Enter the Room type:");
String rt=input.nextLine();
System.out.print("Enter the Floor No:");
String fn=input.nextLine();
System.out.print("Enter the amount:");
double amt=input.nextDouble();

Reservation me = new Reservation(nm,rt,fn,amt);
me.display();

System.out.print("Do you want to refer a friend?");
boolean ch2=input.nextBoolean();

if (ch2){
System.out.print("Enter the name of your friend:");
input.nextLine();
String nm2=input.nextLine();
Reservation friend = new Reservation(me,nm2);
friend.display();}
}
else{
System.out.println("Invalid choice");}
}}
