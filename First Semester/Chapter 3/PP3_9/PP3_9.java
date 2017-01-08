
/**
 * Write a description of class PP3_9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PP3_9 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);
    
    
    acc.withDraw(50);
    acc.withDraw(500);
    acc.withDraw(50);
    acc.withDraw(120);
    acc.withDraw(53);
    acc.withDraw(43);
    acc.withDraw(20);
    acc.deposit(900);
    acc.withDraw(150);
    acc.withDraw(420);
    acc.deductMonthlyCharge();
    System.out.println("The balance is " + acc.getBalance());
        
    
   }
}