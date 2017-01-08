public class PP7_1 {
    public static void main(String[] args) {
        int[] nums = new int[20];
        boolean rep = false;
        boolean first = true;
        for(int i = 0; i < 20; i++) {
            nums[i] = (int)(6*Math.random() + 1);
        }
        for(int i = 0; i < 20; i++) {
            if (i != 19) {
                if (nums[i] == (nums[i+1])){
                    if  (first) {
                        System.out.print("(");
                        first = false;
                    }
                    System.out.print(nums[i] + " ");
                    rep = true;
                } else if (rep) {
                    System.out.print(nums[i]);
                    System.out.print(") ");
                    rep = false;
                    first = true;
                } else {
                    System.out.print(nums[i] + " ");
                }
            }
        }
    }    
}
