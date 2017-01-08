
/**
 * Write a description of class PE5_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        
        System.out.println("Enter three numbers");
        
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();
        
        if(num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        } else if (num3 < num2 && num2 < num1) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
