import java.util.Scanner;
public class PP4_1 {
    public static void main(String[] args) {
        Car hybrid = new Car();
        Scanner scan = new Scanner(System.in);
        
        
        //System.out.println(15000/40);
        System.out.print("Enter the price of the new hybrid: "); //13,000
        hybrid.setCost(scan.nextDouble());
        
        System.out.print("Enter the estimated miles driven per year: "); //15,000 miles
        hybrid.setMiles(scan.nextDouble());
        
        System.out.print("Enter the estimated gas price: ");//$3.80
        hybrid.setGas(scan.nextDouble());
        
        System.out.print("Enter the eefficiency of the hybrid: "); //40 MPG
        hybrid.setMiles(scan.nextDouble());
        
        System.out.print("Enter the estimated value after 5 years: "); //5,000
        hybrid.setMiles(scan.nextDouble());
        
        System.out.println("The total cost of the car after five years will be " + hybrid.totalPrice());
        //15,000
        //$13,000
        //40 MPG
        //$3.80
    }
}
