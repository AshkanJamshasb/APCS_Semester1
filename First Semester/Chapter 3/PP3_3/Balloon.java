
/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon {
    public double radius = 0;
    
    public void inflate(double amount) {
        radius += amount;
    }
    
    public double getVolume() {
        return (4*Math.PI*radius*radius*radius)/3.0;
    }
}