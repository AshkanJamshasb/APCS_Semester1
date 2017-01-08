import java.util.Scanner;
public class PE5_20 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String in1, in2, in3, temp;
        
        System.out.print("Enter three strings: ");
        in1 = scan.next();
        in2 = scan.next();
        in3 = scan.next();
        
        //3 2 1
        if (in2.charAt(0) < in1.charAt(0) && in3.charAt(0) < in2.charAt(0)) {
            temp = in1;
            in1 = in3;
            in3 = temp;
        } //1 3 2
        else if (in1.charAt(0) < in3.charAt(0) && in3.charAt(0) < in2.charAt(0)) {
            temp = in2;
            in2 = in3;
            in3 = temp;
        } //2 3 1
        else if (in3.charAt(0) < in1.charAt(0) && in1.charAt(0) < in2.charAt(0)) {
            temp = in1;
            in1 = in3;
            in3 = in2;
            in2 = temp;
        } //2 1 3
        else if (in1.charAt(0) < in3.charAt(0) && in2.charAt(0) < in1.charAt(0)) {
            temp = in2;
            in2 = in1;
            in1 = temp;
        } //3 1 2
        else if (in3.charAt(0) < in1.charAt(0) && in2.charAt(0) < in3.charAt(0)) {
            temp = in1;
            in1 = in2;
            in2 = in3;
            in3 = temp;
        }
        System.out.println(in1+"\n"+in2+"\n"+in3);
    }    
}
