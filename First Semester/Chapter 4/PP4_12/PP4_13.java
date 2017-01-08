
/**
 * Write a description of class PP4_13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PP4_13 {
    public static void main(String[] args) {
        double t;
        double dTemp;
        double rh;
        double a = 17.27;
        double b = 237.7;
        System.out.println("The current tempurature is 84 degrees and the relative humidity is 0.6");
        t = 84;
        rh = 0.6;
        
        dTemp = (b*(((a*t)/b+t)) + Math.log(rh))/(a-(((a*t)/b+t)) + Math.log(rh));
        System.out.println("The dew point temperature is " + dTemp);
    }
}
