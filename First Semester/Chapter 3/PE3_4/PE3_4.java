
/**
 * Write a description of class PE3_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount momsSavings = new BankAccount(1000);
        int input;
        double interestRate;
        
        System.out.println("1 = get balance.\n2 = add interest.\n3 = exit");
        while(true) {
        System.out.print("Enter a number: ");
        input = scan.nextInt();
        
        switch (input) {
            case 1:
                System.out.println(momsSavings.getBalance());
                break;
            case 2:
                System.out.print("What interest rate would you like to put on?: ");;
                interestRate = scan.nextDouble();
                momsSavings.addInterest(interestRate);
                break;
            case 3:
                System.exit(1);
            default:
                break;
        }  
    }
    }
}
