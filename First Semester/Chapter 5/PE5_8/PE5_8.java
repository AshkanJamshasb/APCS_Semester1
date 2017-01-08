
/**
 * Write a description of class PE5_8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE5_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i1;
        int i2;
        int i3;
        int i4;
        
        System.out.println("Enter four integers");
        
        i1 = scan.nextInt();
        i2 = scan.nextInt();
        i3 = scan.nextInt();
        i4 = scan.nextInt();
        
        if (i1 == i2 && i3 == i4) {
            System.out.println("two pairs");
        } else if (i1 == i3 && i2 == i4) {    
            System.out.println("two pairs");
        } else if (i1 == i4 && i2 == i3) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }
    }    
}
