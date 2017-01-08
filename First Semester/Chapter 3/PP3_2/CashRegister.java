
/**
 * Write a description of class CashRegister here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CashRegister {
    private double taxRate;
    private double totalTax = 0;
    private double totalPurchase = 0;
    
    public CashRegister(double tax) {
        taxRate = tax*.01;
    }
   
    public void recordablePurchase(double price) {
        totalPurchase += price;
    }
    
    public void recordTaxablePurchase(double price) {
        totalTax += price*taxRate;
        totalPurchase += price*(1+taxRate);
    }
    
    public double getTotalPrice() {
        return totalPurchase;
    }
    
    public double getTotalTax() {
        return totalTax;
    }
    
    public double giveChange () {
        return taxRate;
    }
}
