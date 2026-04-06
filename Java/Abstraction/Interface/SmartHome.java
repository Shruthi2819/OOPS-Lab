import java.util.*;

interface PowerControl {
    void on();
    void off();
}

interface SmartControl {
    void connectWifi();
}

class SmartTV implements PowerControl, SmartControl {
    public void on() {
        System.out.println("TV ON");
    }

    public void off() {
        System.out.println("TV OFF");
    }

    public void connectWifi() {
        System.out.println("TV connected to WiFi");
    }
}

class Fan implements PowerControl {
    public void on() {
        System.out.println("Fan ON");
    }

    public void off() {
        System.out.println("Fan OFF");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter device (tv/fan): ");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("tv")) {
            SmartTV tv = new SmartTV();   
            tv.on();
            tv.connectWifi();
            tv.off();
        } 
        else if (type.equalsIgnoreCase("fan")) {
            Fan fan = new Fan();   
            fan.on();
            fan.off();
        } 
        else {
            System.out.println("Invalid input");
        }
    }
}