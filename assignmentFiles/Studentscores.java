package assignmentFiles;
 import java.util.Scanner;
public class Studentscores {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;
       System.out.print("Enter student's score:");
       int score = input.nextInt();
       if(score >=60) {
        System.out.print("pass");
       } else {
        System.out.print("Fail");
       }
       input.close();

    }
}
