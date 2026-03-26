class Notifier{
public void send(String message){
System.out.println("General: "+message);
}
protected void send(String message,String email){
System.out.println("Email to "+email+": "+message);
}
void send(String message,long phone){
System.out.println("SMS to "+phone+": "+message);
}
private void send(String message,String email,long phone){
System.out.println("Internal: "+message+" "+email+" "+phone);
}
public void accessPrivate(String message,String email,long phone){
send(message,email,phone);
}
}

class AppNotifier extends Notifier{
public void use(){
send("Hello");
send("Hi","test@mail.com");
send("OTP",9876543210L);
accessPrivate("Secret","admin@mail.com",9999999999L);
}
}

public class Hi{
public static void main(String[] args){
AppNotifier a=new AppNotifier();
a.use();
Notifier n=new Notifier();
n.send("Welcome");
n.send("Mail","user@mail.com");
n.send("Code",1234567890L);
n.accessPrivate("Hidden","root@mail.com",1111111111L);
}
}