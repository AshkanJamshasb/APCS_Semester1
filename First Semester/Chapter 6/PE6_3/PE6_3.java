import java.util.Scanner;
public class PE6_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        String input;
        
        System.out.println("1. Upper case\n2. Second Letter\n3. No vowels\n4. Number of vowels\n5. Position of vowels");
        choice = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a sentence");
        input = scan.nextLine();
        
        switch (choice) {
            case 1:
                System.out.println(UppercaseLetters(input));
                break;
            case 2:
                System.out.println(SecondLetter(input));
                break;
            case 3:
                System.out.println(NoVowels(input));
                break;
            case 4:
                System.out.println("The number of vowels are " + NumberOfVowels(input));
                break;
            case 5:
                System.out.println(PositionOfVowels(input));
                break;
            default:
                System.out.println("Not a valid choice.");
                break;
        }
    

        
    }
    
    
    
    
    static String UppercaseLetters (String in) {
            String revised = "";
            for (int i = 0; i < in.length(); i++) {
                if ((int)in.charAt(i) > 64 && (int)in.charAt(i) < 91) {
                    revised += in.charAt(i) + " ";
                }
            }
            return revised;
    }  
    
    static String SecondLetter (String in) {
        String revised = "";
                revised += in.charAt(1) + ", ";
        for (int i = 0; i < in.length(); i++) {
            if (i%2 == 1 || i == 1) {
                revised += in.charAt(i);
                revised += ", ";
            }
        }    
            return revised;
    }  
    
    static String NoVowels (String in) {
            String revised = "";
        for (int i = 0; i < in.length(); i++) {
            if ((int)in.toLowerCase().charAt(i) == 'a' || (int)in.toLowerCase().charAt(i) == 'e' || (int)in.toLowerCase().charAt(i) == 'i' || (int)in.toLowerCase().charAt(i) == 'o' || (int)in.toLowerCase().charAt(i) == 'u') {
                revised += "_";
            } else {
                revised += in.charAt(i);
            }
        }
            return revised;
    }  
    
    static int NumberOfVowels (String in) {
        int numVowels = 0;
        for (int i = 0; i < in.length(); i++) {
            if ((int)in.toLowerCase().charAt(i) == 'a' || (int)in.toLowerCase().charAt(i) == 'e' || (int)in.toLowerCase().charAt(i) == 'i' || (int)in.toLowerCase().charAt(i) == 'o' || (int)in.toLowerCase().charAt(i) == 'u') {
                numVowels++;
            }
        }                
        return numVowels;
    }  
    
    static String PositionOfVowels (String in) {
        String revised = "";
        for (int i = 0; i < in.length(); i++) {
            if ((int)in.toLowerCase().charAt(i) == 'a' || (int)in.toLowerCase().charAt(i) == 'e' || (int)in.toLowerCase().charAt(i) == 'i' || (int)in.toLowerCase().charAt(i) == 'o' || (int)in.toLowerCase().charAt(i) == 'u') {
                revised += in.charAt(i) + ", ";
            }
        }    
        revised = revised.substring(0, revised.length() - 2);
        return revised;
    }  
}