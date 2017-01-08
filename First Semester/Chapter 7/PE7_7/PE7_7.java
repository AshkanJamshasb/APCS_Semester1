public class PE7_7 {
    public static void main(String[] args) {
        int[] orig = new int[]{1, 4, 9, 16, 9, 7, 4, 9, 11};
        System.out.print("Original: ");
        for (int e : orig) {
            System.out.print(e + " ");
        }
        System.out.print("\nReversed: ");
        for (int e : reverse(orig)) {
            System.out.print(e + " ");
        }
    }    
    
    public static int[] reverse(int[] in) {
        int[] rev = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            rev[in.length-(1+i)] = in[i];
        }
        return rev;
    }
}