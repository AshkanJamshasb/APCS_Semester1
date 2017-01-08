
/**
 * Write a description of class PP3_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PP3_2 {
    public static void main(String[] args) {
        CashRegister cash = new CashRegister(15);
        
        System.out.println(2.99);
        cash.recordablePurchase(2.99);
        System.out.println(9.99);
        cash.recordTaxablePurchase(9.99);
        System.out.println(9.99);
        cash.recordTaxablePurchase(15.99);
        System.out.println(15.99);
        cash.recordablePurchase(5.99);
        System.out.println(5.99);
        
        System.out.println("The total tax: " + cash.getTotalTax());
        System.out.println("The total price: " + cash.getTotalPrice());
    }
}