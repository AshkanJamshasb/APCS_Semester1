
/**
 * Write a description of class PE4_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double meters;
        
        System.out.print("Enter in a number in meters: ");
        meters = scan.nextDouble();
        
        System.out.println("Miles: " + (meters * 0.000621371));
        System.out.println("Feet: " + (meters * 3.28084));
        System.out.println("Inches: " + ((meters * 3.28084)*12));
    }    
}
