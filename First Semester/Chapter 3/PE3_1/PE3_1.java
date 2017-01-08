
/**
 * Write a description of class PE3_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PE3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Counter count = new Counter();
        int input;
        
        System.out.println("1 = get value.\n2 = add.\n3 = reset.\n4 = undo.\n5 = exit");
        while(true) {
        System.out.print("Enter a number: ");
        input = scan.nextInt();
        
        switch (input) {
            case 1:
                System.out.println(count.getValue());
                break;
            case 2:
                count.click();
                break;
            case 3:
                count.reset();
                break;
            case 4:
                count.undo();
                break;
            case 5:
                System.exit(1);
            default:
                break;
        }  
    }
    }
}
