public class PE7_4 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 5, 1, 5, 6, 7,};
        double sum = 0;
        int smallNum = nums[0];
        for(int e : nums) {
            sum += e;
            if(smallNum>e) 
                smallNum = e;
        }
        sum -= smallNum;
        System.out.println("The sum is: " + sum);
    }
}