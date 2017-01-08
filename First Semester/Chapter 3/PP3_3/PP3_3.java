
/**
 * Write a description of class PP3_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PP3_3 {
    public static void main(String[] args) {
        Balloon pop = new Balloon();
        
        pop.inflate(5);
        pop.inflate(10);
        
        
        System.out.println("A balloon with a radius of " + pop.radius + " has a volume of " + pop.getVolume());
    }
}