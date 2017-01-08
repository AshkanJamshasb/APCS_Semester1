import java.util.Scanner;
public class PP5_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double jump;
              
        double escape = Math.sqrt(2 * ((6.67 * Math.pow(10, -11) * 1.3 * Math.pow(10, 22)))/(1.153 * Math.pow(10, 6)));
        System.out.print("Enter the astronauts jump velocity: ");
        jump = scan.nextDouble();
        double needs = -((Math.pow(jump, 2)*1.153*Math.pow(10, 6))/(2*1.3*Math.pow(10, 22))) + (6.66*Math.pow(10, -11));
        
        if (jump > escape) {
            System.out.println("The astronaut escaped");
        } else {
            System.out.println("The gravitational constant needs to be " + needs + "greater.");
        }
        
    }    
}
