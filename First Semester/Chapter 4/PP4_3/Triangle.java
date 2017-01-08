import java.util.Scanner;
public class Triangle {
    
    int x0, x1, x2, y0, y1, y2;
    public static void main(String[] args) {
        
        Scanner scanObject = new Scanner(System.in);
        Triangle tri = new Triangle();
        
        System.out.print("Enter x coordinate for first point: ");
        tri.x0 = scanObject.nextInt();
        System.out.print("Enter y coordinate for first point: ");
        tri.y0 = scanObject.nextInt();
        System.out.print("Enter x coordinate for second point: ");
        tri.x1 = scanObject.nextInt();
        System.out.print("Enter y coordinate for second point: ");
        tri.y1 = scanObject.nextInt();
        System.out.print("Enter x coordinate for third point: ");
        tri.x2 = scanObject.nextInt();
        System.out.print("Enter y coordinate for third point: ");
        tri.y2 = scanObject.nextInt();
        
        System.out.println("Legnth of sides are " + tri.getSideA() + ", " + tri.getSideB() + " and " + tri.getSideC());
        System.out.println("Legnth of angles are " + tri.getAngleA() + ", " + tri.getAngleB() + " and " + tri.getAngleC());
        System.out.println("The perimeter is " + tri.getPerimeter());
        System.out.println("The area is " + tri.getArea());
    }
    
    public double getSideA()
    {
    
        return Math.sqrt((Math.pow(x1-x0,2))+(Math.pow(y1-y0,2)));
    } 
    
    public double getSideB()
    {
        return Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));
    }
    
    public double getSideC()
    {
        return Math.sqrt((Math.pow(x0-x2,2))+(Math.pow(y0-y2,2)));
    }
    
    public double getAngleA()
    {
        double as = getSideA(), bs = getSideB(), cs = getSideC();
        double angle = Math.acos((bs*bs + cs*cs - as*as) / (2*bs*cs));
        return angle;
    }
    
    public double getAngleB()
    {
        double as = getSideA(), bs = getSideB(), cs = getSideC();
        double angle = Math.acos((as*as + cs*cs - bs*bs) / (2*as*cs));
        return angle;
    }
    
    
    public double getAngleC()
    {
        double as = getSideA(), bs = getSideB(), cs = getSideC();
        double angle = Math.acos((as*as + bs*bs - cs*cs) / (2*as*bs));
        return angle;
    }
        
        public double getPerimeter()
    {
        double as = getSideA(), bs = getSideB(), cs = getSideC();
        return (as + bs + cs); 
    }
    
    double getSignedArea() 
    {
    double signedArea = 0.5 * (x0 * (y1 - y2) +
        x1 * (y2 - y0) +
        (x2 * y0) - y1);
        return signedArea;
    }
    
    public double getArea() 
    {
        return Math.abs(getSignedArea());
    }
}