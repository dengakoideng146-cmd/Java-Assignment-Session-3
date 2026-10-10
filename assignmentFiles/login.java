package assignmentFiles;
import java.util.Scanner;
public class login {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String correctUsername= "admin";
    String correctPassword= "12345";
    System.out.print ("Enter username:");
    String username =input.nextLine();
    System.out.print("Enetr password:");
    String password =input.nextLine();
    if (! username.equals(correctUsername)) {
        System.out.print("Incorrect username");
    } else if (!password.equals(correctPassword)) {
        System.out.print("incorrectpassword");
    } else {
        System.out.print("Loginsuccessful");
    }
    input.close();
    
        



}
    
}
