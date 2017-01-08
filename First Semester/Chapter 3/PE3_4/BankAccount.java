
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount {
    private double balance;     
        
    BankAccount (double balance) {
        this.balance = balance; 
    }
    
    public double getBalance() {
        return balance;
    }

    public void addInterest(double rate) {
        balance += (balance * (rate*0.01));
    }
}