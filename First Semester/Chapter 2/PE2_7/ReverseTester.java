
/**
 * Write a description of class ReverseTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.StringBuilder;
public class ReverseTester {
    
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("desserts");
        System.out.println("The original word is " + word);
        System.out.println("The reversed word is " + word.reverse());
    }
}
