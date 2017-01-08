import java.util.Scanner;
public class PE6_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String in = scan.nextLine();
        
        int numVowels = 0;
    
        for (int i = 0; i < in.length(); i++) {
            if ((int)in.toLowerCase().charAt(i) == 'a' || (int)in.toLowerCase().charAt(i) == 'e' || (int)in.toLowerCase().charAt(i) == 'i' || (int)in.toLowerCase().charAt(i) == 'o' || (int)in.toLowerCase().charAt(i) == 'u') {
                numVowels++;
            }
        }    
        
        System.out.println("The number of vowels are: " + numVowels);
    }
}
