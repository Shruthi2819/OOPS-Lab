class Device {
    void operate(){
        System.out.println("Appliance operating!!");
        } 
}

class Light extends Device{
    void operate(){
        System.out.println("Light turns on .");
    }
}

class Fan extends Device{
    void operate(){
        System.out.println("Fan is rotating.");
    }
}

class AC extends Device{
    void operate(){
        System.out.println("Air Conditioner is making the room cool.");
    }
}

public class Appliance{
    public static void main(String []  args){
        Device d;

        d = new Light();
        d.operate();

        d = new Fan();
        d.operate();

        d = new AC();
        d.operate();
    }
}
