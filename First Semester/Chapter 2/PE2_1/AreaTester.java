
/**
 * Write a description of class AreaTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Rectangle;
public class AreaTester {
    
    public static void main (String args[]) {
        
        Rectangle rect = new Rectangle(10, 10, 20, 30);
        
        System.out.println("The width is: " + rect.getWidth() + "\nThe height is: " + rect.getHeight() + "\nThe area is: " + (rect.getWidth() * rect.getHeight()));
       
    }
    
}
