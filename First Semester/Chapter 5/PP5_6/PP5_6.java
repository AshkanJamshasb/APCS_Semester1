
/**
 * Write a description of class PP5_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PP5_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int input = scan.nextInt();
        String numeral = "";
        if (input >= 1000) {
            if (input/1000 == 3) {
                numeral += "MMM";
                input -= 3000;  
            }else 
            if (input/1000 == 2) {
                numeral += "MM";
                input -= 2000;  
            }else
            if (input/1000 == 1) {
                numeral+= "M";
                input -= 1000;  
            }
        }
        if (input >= 900) {
            numeral += "CM";
            input -= 900;
        }
        if (input >= 500) {
            numeral += "D";
            input -= 500;
        }
        if (input >= 400) {
            numeral += "CD";
            input -= 400;
        }
        if (input >= 100) {
            if (input/100 == 3) {
                numeral += "CCC";
                input -= 300;  
            }else
            if (input/100 == 2) {
                numeral += "CC";
                input -= 200;  
            }else
            if (input/100 == 1) {
                numeral+= "C";
                input -= 100;  
            }
        }
        if (input >= 90) {
            numeral += "XC";
            input -= 90;
        }
        if (input >= 50) {
            numeral += "L";
            input -= 50;
        }
        if (input >= 40) {
            numeral += "XL";
            input -= 40;
        }
        if (input >= 10) {
            if (input/10 == 3) {
                numeral += "XXX";
                input -= 30;  
            }else
            if (input/10 == 2) {
                numeral += "XX";
                input -= 20;  
            }else
            if (input/10 == 1) {
                numeral+= "X";
                input -= 10;  
            }
        }
        if (input >= 9) {
            numeral += "IX";
            input -= 9;
        }
        if (input >= 5) {
            numeral += "V";
            input -= 5;
        }
        if (input >= 4) {
            numeral += "IV";
            input -= 4;
        }
        if (input >= 1) {
            if (input/1 == 3) {
                numeral += "III";
                input -= 3;  
            }else
            if (input/1 == 2) {
                numeral += "II";
                input -= 2;  
            }else
            if (input/1 == 1) {
                numeral+= "I";
                input -= 1;  
            }
        }    
        System.out.println(numeral);
    }
}