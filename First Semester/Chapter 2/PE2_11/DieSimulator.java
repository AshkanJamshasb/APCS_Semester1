
/**
 * Write a description of class DieSimulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class DieSimulator {
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.println("Simulate dice rolling...");
        System.out.println("The dice rolled a: " + (1 + generator.nextInt(6)));        
    }
}