
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount {
    private double balance;     
    private double charge = 0;
    BankAccount (double balance) {
        this.balance = balance; 
    }
    
    public void withDraw(double amount) {
        charge++;
        balance -= amount;
    }
    
    public void deposit(double amount) {
        charge++;
        balance += amount;
    }
    
    public double getBalance() {
        return balance;
    }

    public void addInterest(double rate) {
        balance += (balance * (rate*0.01));
    }
    
    public void deductMonthlyCharge(){
        if(Math.max(charge, 5) == 5) {
            charge -= 5; //five free
            balance -= charge*15;//15 dollar charge
        }
        charge = 0;//reset the charge
    }
}