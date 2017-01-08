
/**
 * Write a description of class PP5_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PP5_4{ 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String from;
        String to;
        double inVal;
        double value;
        int type1;
        int type2;
        
        System.out.print("Convert from? ");
        from = scan.next().trim();
        if (from.equals("fl. oz") || from.equals("gal")|| from.equals("oz") || from.equals("lb") || from.equals("in") || from.equals("ft") || from.equals("mi")) {
            if(from.equals("fl. oz") || from.equals("gal")) {
                type1 = 1;
            } else if(from.equals("oz") || from.equals("lb")) {
                type1 = 2;
            } else {
                type1 = 3;
            }
            System.out.print("Convert to? ");
            to = scan.next().trim();
            if (to.equals("ml") || to.equals("l") || to.equals("g") || to.equals("kg") || to.equals("mm") || to.equals("cm") || to.equals("m") || to.equals("km")) {
                if(to.equals("ml") || to.equals("l")) {
                    type2 = 1;
                } else if(to.equals("g") || to.equals("kg")) {
                    type2 = 2;
                } else {
                    type2 = 3;
                }
                System.out.print("Value? ");
                inVal = scan.nextDouble();
                value = inVal;
                if(type1 == type2) {
                    if(type1 == 1) {//dealing with liquid
                        if(from.equals("gal")) {
                            value *= 128;//converting it to smallest form
                        }
                        if(to.equals("ml")) {
                            value *= 29.5735;
                        } else {
                            value *= 0.0295735;
                        }
                    } else if (type1 == 2) {//dealing with weight
                        if(from.equals("lb")) {
                            value *= 16;
                        }
                        if(to.equals("kg")) {
                            value *= 0.453592;
                        } else {
                            value *= 453.592;
                        }
                    } else {//dealing with length
                        if(from.equals("ft")) {
                            value *= 12;
                        } else if(from.equals("mi")) {
                            value *= 63360;
                        }
                        if(to.equals("mm")) {
                            value *= 0.0393701;
                        } else if(to.equals("cm")) {
                            value *= 0.393701;
                        } else if(to.equals("m")) {
                            value *= 39.3701;
                        } else {
                            value *= 39370.1;
                        }
                    }
                    System.out.println(inVal + " " + from + " = " + value + " " + to);
                } else {
                    System.out.println("Invalid comparion types.");
                }
            } else {
                System.out.println("Invalid type");
            }
        } else {
            System.out.println("Invalid type");
        }
        
    }    
}