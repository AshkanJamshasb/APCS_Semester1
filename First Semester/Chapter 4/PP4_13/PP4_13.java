
/**
 * Write a description of class PP4_13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PP4_13 {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       
       double r0 = 1075;
       double t0 = 85;
       double b = (3969 - 273);
       double r;
       double t;
       
       System.out.print("Enter in the thermostat resistance: ");
       r = scan.nextDouble();
       
       t = ((b*t0)/((t0*(Math.log((r/r0)))))+b)-273;
       
       System.out.println("The liquids temperature is " + t);
    }    
}
