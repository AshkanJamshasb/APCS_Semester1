import java.util.Scanner;
public class PP5_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1, p2, p3, p4, p5, p6, p7, p8;
        char p9;
        System.out.print("Enter your input: ");
        p1 = scan.nextInt();//left lock
        p2 = scan.nextInt();//right lock
        p3 = scan.nextInt();//child lock
        p4 = scan.nextInt();//master lock
        p5 = scan.nextInt();//inside left
        p6 = scan.nextInt();//inside right
        p7 = scan.nextInt();//outside left
        p8 = scan.nextInt();//outside right
        p9 = scan.next().charAt(0);
        
        if(p4 == 0 && p9 == 'P' && (p1 == 0 && p2 == 0)) {
            if (p1 == 0 || (p3 != 1 && p5 != 1) || p7 == 1) {
                System.out.println("left door opens");
            }
            if (p2 == 0 || (p3 != 1 && p6 != 1) || p8 == 1) {
                System.out.println("right door opens");
            }
        } else {
            System.out.println("both doors stay closed");
        }
    }
}
