package assignmentFiles;
import java.util.Scanner;
public class parkingfee {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter parking hours:");
        int hours = input.nextInt();
        int fee;
        if(hours <= 0) {
            System.out.print("invalid parking hours");
        } else if (hours == 1) {
            fee = 5000;
            System.out.print("parking fee : Rp" + fee);
        } else {
            fee = 5000 + (hours - 1) * 3000 ;
            if (fee > 20000) {
                fee = 20000;
            }
            System.out.print ("parking fee: Rp" + fee);
        }
        input.close();

    }

    
}
