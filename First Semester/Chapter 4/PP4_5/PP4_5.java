
/**
 * Write a description of class PP4_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PP4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double priceBooks;
        int numBooks;
        double tax;
        int ship;
        double totalPrice;
        
        System.out.print("Enter the price of the books: ");
        priceBooks = scan.nextDouble();
        
        System.out.print("Enter the number of books: "); 
        numBooks = scan.nextInt();
        
        tax = 0.075*priceBooks;
        ship = 2*numBooks;
        totalPrice = tax + ship + priceBooks;
        
        System.out.println("The price of the order is: " + totalPrice);
    }    
}
