import java.util.Scanner;
public class PE6_9 {
    public static void main(String[] args) {
        String input, output = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        input = scan.nextLine();
        for (int i = input.length() -1; i >= 0; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
