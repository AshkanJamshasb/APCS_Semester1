
public class PE7_1 {
    public static void main(String[] args) {
        int[] numbs = new int[10];
        
        for (int i = 0; i < 10; i++) {
           numbs[i] = (int)(Math.random()*10);
        }
        System.out.print("Even elements: ");
        for (int i = 0; i < 10; i++) {
           if(i%2==0)
            System.out.print("["+i+"] "+numbs[i]+"  ");
        }
        System.out.print("\nElements that are even: ");
        for (int i = 0; i < 10; i++) {
           if(numbs[i]%2==0)
            System.out.print(numbs[i]+" ");
        }  
        System.out.print("\nBackwards: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbs[i]+" ");
        }
        System.out.print("\nFirst and last: "+numbs[0] + " & " + numbs[9]);
    }
}
