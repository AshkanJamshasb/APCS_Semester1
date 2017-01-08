
/**
 * Write a description of class PE6_7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class PE6_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen;
        int ran1, ran2, length;
        String input;
        
        System.out.println("Enther a string.");
        input = scan.nextLine();
        System.out.println("In: " + input.length());
        length = input.length();
        for (int i = 0; i < length; i++) {
                gen = new Random();
                ran1 = (1 + gen.nextInt((length/2)));
            //    System.out.println("Ran1: " + ran1);
                gen = new Random();
                ran2 = (((length/2) + (gen.nextInt((length/2)))));
            //    System.out.println("Ran2: "+ (((length/2) + (gen.nextInt((length/2))))));
            //    System.out.println("r1: " + ran1 + ", r2: " + ran2);
            input = input.substring(0, ran1) + 
                    input.charAt(ran2) + 
                    input.substring(ran1, ran2) + 
                    input.charAt(ran2) + 
                    input.substring(ran2, length);
        }
        System.out.println(input);
    }
}