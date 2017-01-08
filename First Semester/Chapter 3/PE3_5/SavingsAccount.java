
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SavingsAccount {
    private double balance;  
    private double interest;
        
    SavingsAccount (double balance, double interest) {
        this.balance = balance; 
        this.interest = interest;
    }
    
    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        balance += (balance * (interest*0.01));
    }
}