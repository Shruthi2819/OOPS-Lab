import java.util.Scanner;
class Delivery{
    String itemname;
    int quantity;
    String deliveryaddress;
    String special;

    Delivery(){
        this.itemname = "Veg Combo";
        this.quantity = 1;
        this.deliveryaddress = "To be updated..";
    }

    Delivery(String name , int quantity){
        this.itemname = itemname;
        this.quantity = quantity;
        this.deliveryaddress = "Home Address on File";

    }

    Delivery(String itemname, int quantity , String deliveryaddress,String special){
        this.itemname = itemname;
        this.quantity = quantity;
        this.deliveryaddress = deliveryaddress;
        this.special = special;
    }

    public void display(){
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("         ORDER DETAILS");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("Item Name: "+itemname);
    System.out.println("Quantity: "+quantity);
    System.out.println("Delivery Address: "+deliveryaddress);
    System.out.println("Custom instruction: "+special);
    System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("QUICKBITE ORDER CREATION SYSTEM");
        System.out.println();
        System.out.println("1.Quick Order");
        System.out.println("2.Order to home address");
        System.out.println("3.Order with custom delivery address");
        System.out.println();
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        System.out.println();
        
        if(choice==1){
            Delivery d1 = new Delivery();
            d1.display();
        }

        else if (choice==2){
            System.out.print("Enter itemname:");
            String name = sc.nextLine();

            System.out.print("Enter quantity : ");
            int qty = sc.nextInt();
            sc.nextInt();

            Delivery d1 = new Delivery(name,qty);
            d1.display();
        }

        else if (choice==3){
            System.out.print("Enter itemname :");
            String n = sc.nextLine();

            System.out.print("Enter quantity: ");
            int qt = sc.nextInt();
            sc.nextInt();

            System.out.print("Enter deliveryaddress :");
            String del = sc.nextLine();

            System.out.print("Enter special cooking instruction :");
            String sp = sc .nextLine();

            Delivery d1 = new Delivery(n,qt,del,sp);
            d1.display();
        }

    }
}