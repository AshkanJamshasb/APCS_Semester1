
/**
 * Write a description of class PE4_10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE4_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double gallons;
        double eff;
        double price;
        
        System.out.print("Enter the number of gallons of gas in your tank: ");
        gallons = scan.nextDouble();
        
        System.out.print("Enter the fuel efficiency in miles per gallon: " );
        eff = scan.nextDouble();
        
        System.out.print("Enter the price of gas per gallon: " );
        price = scan.nextDouble();
        
        System.out.println("The price for 100 miles is " + (100 * (1/eff))*price + " and the car will go " + gallons*eff);
    }    
}
