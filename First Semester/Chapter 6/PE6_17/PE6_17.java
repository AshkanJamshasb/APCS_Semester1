import java.util.Scanner;
public class PE6_17 {
    public static void main(String[] args) {
        double us, yen;
        Scanner scan = new Scanner(System.in);
        final double trans = 107.46;
        do {
            System.out.print("US dollar value: ");
            us = scan.nextDouble();
            yen = us * trans;
            System.out.println("The value of $" + us + " in yen is " + yen);
        }while (us != 0);
    }
    
}