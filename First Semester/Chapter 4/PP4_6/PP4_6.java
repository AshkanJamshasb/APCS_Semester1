
/**
 * Write a description of class PP4_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PP4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phone;
        
        System.out.print("Enter your phone number: ");
        phone = scan.nextLine();
        
        System.out.println("(" + phone.substring(0,3) + ") " + phone.substring(3,6) + "-" + phone.substring(6));
    }
}