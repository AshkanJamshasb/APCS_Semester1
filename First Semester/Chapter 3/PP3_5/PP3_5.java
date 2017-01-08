
/**
 * Write a description of class PP3_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PP3_5 {
    public static void main(String[] args) {
        Battery battery = new Battery(2500);
        
        battery.drain(1250);
        battery.drain(50);
        System.out.println("The remaining capacity is " + battery.getRemainingCapacity());
        battery.charge();
        System.out.println("The remaining capacity is " + battery.getRemainingCapacity());
        
    }
}
