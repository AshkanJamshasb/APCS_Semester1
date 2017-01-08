
/**
 * Write a description of class PE3_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SavingsAccount momsSavings = new SavingsAccount(1000, 10);
        int input;
        
        System.out.println("1 = get balance.\n2 = add interest.\n3 = exit");
        while(true) {
        System.out.print("Enter a number: ");
        input = scan.nextInt();
        
        switch (input) {
            case 1:
                System.out.println(momsSavings.getBalance());
                break;
            case 2:
                momsSavings.addInterest();
                break;
            case 3:
                System.exit(1);
            default:
                break;
        }  
    }
    }
}
