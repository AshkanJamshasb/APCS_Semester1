
/**
 * Write a description of class PP5_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PP5_2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String married;
        double income;
        double tax = 0;
        
        System.out.println("Are you single? (y/n)");
        married = scan.next();
        System.out.println("What is your income?");
        income = scan.nextDouble();
        
        if (married.equals("y")) {
            if (income >= 8000) {
                tax = 8000 + ((income - 8000) * 0.15);
                if (income >= 32000) {
                    tax = 4400 + ((income - 32000) * 0.25);
                } 
            }
        } else if (married.equals("n")) {
            if (income >= 16000) {
                tax = 16000 + ((income - 16000) * 0.15);
                if (income >= 64000) {
                    tax = 8800 + ((income - 64000) * 0.25);
                } 
            }
        } else {
            System.out.println("Didn't properly answer if you were married");
        }
        System.out.println("Your tax is: " + tax);
    }
}
