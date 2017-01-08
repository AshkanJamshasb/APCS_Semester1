
/**
 * Write a description of class PP1_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PP1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distance, fuelEff, trainCost, carCost;
        
        System.out.println("Calculating which form of transportation is cheaper?");
        System.out.print("Enter the distance being travaled (in miles): ");
        distance  = scan.nextDouble();
        System.out.print("How much is a train ticket? $");
        trainCost = scan.nextDouble();
        System.out.print("How many miles to the gallon does your car have? ");
        fuelEff = scan.nextDouble();
        
        carCost = (((1/fuelEff)*distance)*4) + (0.05*distance);
        
        if(carCost<trainCost){
            System.out.printf("The car is cheaper by $%4.2f", (trainCost-carCost));
        } else if (carCost>trainCost) {
            System.out.printf("The train is cheaper by $%4.2f", (carCost-trainCost));
        } else {
            System.out.println("They are both the same cost");
        }
    }
}
