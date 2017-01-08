import java.util.Scanner;
public class PE6_13 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        num = scan.nextInt();
        System.out.println(num%2);
        while (num / 2 != 0) {
            num /= 2;
            System.out.println(num%2);
        }        
    }
}