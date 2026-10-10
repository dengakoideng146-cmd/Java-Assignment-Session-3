package assignmentFiles;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter number a :");
        int a =input.nextInt();
        System.out.print("Enter number b:");
        int b =input.nextInt();
        if (a>b) {
            System.out.print("a is larger");
        } else {
            if (b > a);
            System.out.print("b is greater");
        }  {
            System.out.print("both numbers are equal");
        }
        input.close();


    }

    
}
