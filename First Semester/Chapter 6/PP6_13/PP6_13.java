import java.util.Scanner;
public class PP6_13 {
    public static void main(String[] args) {
        final double DELTA_T = 0.01;
        final double GRAVITY = 9.81;
        double initialV, time, position;
        int count = 0;
       
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the velocity of the cannonball: ");
        initialV = scan.nextDouble();
        System.out.print ("Enter the time the cannonball travels: ");
        time = scan.nextDouble();
        position = -0.5 * GRAVITY * Math.pow(time, 2) + initialV * time; 
        System.out.println ("Value from the formula: " + position);
        while(position >= 0) {
            position = position + initialV * DELTA_T;
            initialV = initialV - GRAVITY * DELTA_T;
            count++;
            if (count % 100 == 0) {
                System.out.println ("Current position at this second: " + position + " meters");
                System.out.println ("Current velocity at this second: " + initialV + " m/s^2");
            }
        }
    }
}
