
/**
 * Write a description of class PE4_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstNum;
        int secondNum;
        
        System.out.print("Enter two intergers: " );
        firstNum = scan.nextInt();
        secondNum = scan.nextInt();
        
        System.out.printf("%-10s%5d\n", "Sum:", (firstNum + secondNum));
        System.out.printf("%-10s%5d\n", "Difference:" ,(firstNum - secondNum));
        System.out.printf("%-10s%5d\n", "Product:", (firstNum * secondNum));
        System.out.printf("%-10s%5.1f\n", "Average:", (firstNum + secondNum)/2.0);
        System.out.printf("%-10s%5d\n", "Distance:", Math.abs(firstNum - secondNum));
        System.out.printf("%-10s%5d\n", "Max:", Math.max(firstNum, secondNum));
        System.out.printf("%-10s%5d\n", "Min:", Math.min(firstNum, secondNum));
        
        
    }    
}