import java.util.Scanner;
public class FactorPrinter {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter a number you would like to factor: " );
        n = scan.nextInt();

        FactorGenerator fac = new FactorGenerator(n);
        for(int i=2; i<=n; i++){
            while(fac.hasMoreFactors(n, i)){
                System.out.println(fac.nextFactor(i));
                n = n/i;
            }
        }
    }
    
}