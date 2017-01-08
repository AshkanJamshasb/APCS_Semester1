import java.util.Scanner;
public class PE6_16 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side length: ");
        num = scan.nextInt();
        for (int i = 1; i <= (num*2-1); i += 2) {
            for (int j = 0; j < (num*2-1) - i / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = (num*2-3); i > 0; i -= 2) {
          for (int j = 0; j < (num*2-1) - i / 2; j++) {
                System.out.print(" ");
          }
          for (int j = 0; j < i; j++){
                System.out.print("*");
          }
          System.out.print("\n");
        }
}
}