
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter {
    private int value;     
        
    public int getValue() {
        return value;
    }
    
    public void click() {
        value++;
    }
    
    public void reset() {
        value = 0;
    }
    
    public void undo() {
        if (Math.max(value, 0) != 0) {
            value--;
        } 
    }
}