import java.util.Scanner;
public class Hospital{
String name; int id; int age; String ward; String notes;
int count=1001;

public Hospital(){
this.name="unknown";
this.id=count;
count++;
this.age=0;
this.ward="Emergency";
}

public Hospital(String name, int age, String ward,String notes){
this.name=name;
this.id=count;
count++;
this.age=age;
this.ward=ward;
this.notes=notes;
}

public Hospital(Hospital h,String ward){
this.name=h.name;
this.id=count;
count++;
this.age=h.age;
this.ward=ward;
this.notes=h.notes;
}

public void display(){
System.out.println();
System.out.println("----------------------------------------------------------------------");
System.out.println("                        PATIENT DETAILS");
System.out.println("----------------------------------------------------------------------");
System.out.println("Patient name: "+name);
System.out.println("ID: "+id);
System.out.println("Age: "+age);
System.out.println("Ward: "+ward);
System.out.println("Health notes: "+notes);
System.out.println();
}

public static void main(String args[]){
Scanner input= new Scanner(System.in);
System.out.println("HOSPITAL REGISTRATION SYSTEM");
System.out.println("1.Emergency registration");
System.out.println("2.OPD/camp registration");
System.out.println();
System.out.print("Enter the registration type:");
int ch=input.nextInt();
if (ch==1){
Hospital record = new Hospital();
record.display();
}
else if(ch==2){
System.out.print("Enter the name:");
input.nextLine();
String nm=input.nextLine();
System.out.print("Enter the Age:");
int ag=input.nextInt();
System.out.print("Enter the ward:");
input.nextLine();
String war=input.nextLine();
System.out.print("Enter the health notes:");
String note=input.nextLine();

Hospital record = new Hospital(nm,ag,war,note);
record.display();

if (war.equals("camp")){
System.out.print("Do you want to create a hospital record with the camp record:");
boolean c = input.nextBoolean();
if (c){
System.out.print("Enter the ward:");
input.nextLine();
String new_ward=input.nextLine();
Hospital record2 = new Hospital(record,new_ward);
record2.display();
}
}
}
}}