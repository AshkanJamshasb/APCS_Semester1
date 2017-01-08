import java.util.Scanner;
public class PP6_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DataSet dat = new DataSet();
        boolean go = true;
        double value;
        do {
            System.out.print("Enter a number (Enter a char to quit): ");
            if (scan.hasNextDouble()) {
                value = scan.nextDouble();
                dat.add(value);
            } else {
                System.out.println("Count: " + dat.count + "\nAverage: " + dat.getAverage() + "\nStandard Deviation: " + dat.getStandardDeviation()); 
                go = false;
            }
        } while (go);
    }
}