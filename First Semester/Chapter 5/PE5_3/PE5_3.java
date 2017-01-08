
/**
 * Write a description of class PE5_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        
        System.out.println("Enter an integer");
        
        input = scan.nextInt();
        input = Math.abs(input);
        
        if(input >= 100000000) 
            System.out.println("Your number has 9 digits.");
        else if (input >= 10000000) 
            System.out.println("Your number has 8 digits.");
        else if (input >= 1000000) 
            System.out.println("Your number has 7 digits.");
        else if (input >= 100000) 
            System.out.println("Your number has 6 digits.");
        else if (input >= 10000) 
            System.out.println("Your number has 5 digits.");
        else if (input >= 1000) 
            System.out.println("Your number has 4 digits.");
        else if (input >= 100) 
            System.out.println("Your number has 3 digits.");
        else if (input >= 10) 
            System.out.println("Your number has 2 digits.");
        else 
            System.out.println("Your number has 1 digits.");
        }
}