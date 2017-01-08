import java.util.Scanner;
//page 230
public class PE5_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double income;
        double tax = 0;
        double remaining;
        
        System.out.print("Enter your income: ");
        income  = scan.nextDouble();
        
        if (income >= 50000) {
            tax += 50000 * 0.01;
            if (income >= 75000) {
                tax += (75000 - 50000) * 0.02;
                if (income >= 100000) {
                    tax += (100000 - 75000) * 0.03;
                    if (income >= 250000) {
                        tax += (250000- 100000) * 0.04;
                        System.out.print("P3");
                        if (income >= 500000) {
                            tax += (500000 - 250000) * 0.05;
                        } else {
                            tax += (income - (250000)) * 0.05;
                        }
                    } else {
                        tax += (income - (100000)) * 0.04;
                    }
                } else {
                    tax += (income - (75000)) * 0.03;
                }
            } else {
                tax += (income - 50000) * 0.02;
            }
        } else {
            tax += income * 0.01;
        }
        
        System.out.println("Your tax is " + tax);
    }
}
