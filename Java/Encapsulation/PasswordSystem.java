import java.util.*;

class Password {
    private String password = "Shruthi1@";
    private int attempts = 0;
    private boolean isBlocked = false;
    private boolean isLoggedIn = false;

    public void checkPassword(String input) {
        if (isBlocked) {
            System.out.println("Account Blocked!");
            return;
        }

        if (password.equals(input)) {
            System.out.println("Login Successful !!!");
            isLoggedIn = true;   // mark success
        } 
        else {
            attempts++;
            System.out.println("Wrong Password :( !");

            if (attempts >= 3) {
                isBlocked = true;
                System.out.println("Account blocked due to 3 wrong attempts..");
            }
        }
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Password p = new Password();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Password : ");
            String pw = sc.nextLine();

            p.checkPassword(pw);

           
            if (p.isLoggedIn()) {
                break;
            }
        }
    }
}