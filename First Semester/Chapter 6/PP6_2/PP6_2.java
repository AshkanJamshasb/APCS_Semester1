import java.util.Scanner;
public class PP6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num, fnew = 2;
        int fold1 = 1;
        int fold2 = 1;
        System.out.print("Enter the number of time you would like the run: ");
        num = scan.nextInt();
        
        for (int i = 1; i < num - 2; i++) {
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1 + fold2;
        }        
        System.out.println("The nth term is: " + fnew);
    }
}
