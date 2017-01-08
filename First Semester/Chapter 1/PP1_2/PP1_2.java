
/**
 * Write a description of class PP1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PP1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mileage, toWork;
        int workDays;
        
        System.out.print("What is the distance to your work from your home (in miles)? ");
        toWork = scan.nextDouble();
        
        System.out.print("What is the beginning mileage on your car? ");
        mileage = (scan.nextDouble() * (-1));
        
        System.out.print("What is the ending mileage on your car? ");
        mileage += scan.nextDouble();
        
        System.out.print("How many days did you work? ");
        workDays = scan.nextInt();
        
        System.out.printf("%4.2f%% of your car was used for commuting to work, the other %4.2f%% was used for personal use.", ((toWork*workDays)/mileage)*100, 100-(((toWork*workDays)/mileage)*100)); 
    }
}
