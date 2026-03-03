class Details {
    int memberid;
    String name;
    int age;
    String membershiptype;
    int feeamount;

    Details(int memberid, String name, int age, String membershiptype, int feeamount) {
        this.memberid = memberid;
        this.name = name;
        this.age = age;
        this.membershiptype = membershiptype;
        this.feeamount = feeamount;
    }

    void display() {
        System.out.println("Member ID: " + memberid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Type: " + membershiptype);
        System.out.println("Fee Amount: " + feeamount);

        if (age < 25) {
            System.out.println("Eligible for Youth Discount ✅");
        } else {
            System.out.println("Not Eligible for Youth Discount ❌");
        }

        System.out.println("---------------------------");
    }
}

public class Gym {
    public static void main(String[] args) {

        Details m1 = new Details(101, "Shruthi", 22, "Monthly", 2000);
        Details m2 = new Details(102, "Rahul", 28, "Quarterly", 5000);
        Details m3 = new Details(103, "Anita", 19, "Annual", 15000);
        Details m4 = new Details(104, "Kiran", 30, "Monthly", 2000);

        System.out.println("Welcome to FitLife Gym!");
        System.out.println("---------------------------");

        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
}































