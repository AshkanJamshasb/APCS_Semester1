
/**
 * Write a description of class Battery here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battery{
    private double capacity;
    private double maxCapacity;
    public Battery(double capacity) {
       maxCapacity = capacity;
       this.capacity = capacity;
    }
    
    public void drain(double amount) {
        capacity -= amount;
    }
    
    public void charge(){
        capacity = maxCapacity;
    }
    
    public double getRemainingCapacity() {
        return capacity;
    }
}