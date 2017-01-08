
/**
 * Write a description of class PE4_13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE4_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num;
        int numOfChar;
        
        System.out.print("Please enter an integer between 1000 and 999999: ");
        num = scan.nextLine();
        
        numOfChar = num.length();
        
        System.out.println(num.substring(0, numOfChar-3) + "," + num.substring((numOfChar-3), numOfChar));
    }
}