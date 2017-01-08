public class PE7_5 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 5, 1, 5, 6, 7,};
        System.out.print("Original: ");
        for (int e : nums) 
            System.out.print(e + " ");
            
        int index = 0;
        int smallNum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(smallNum>nums[i]) 
                index = i;
        }
        
        System.out.print("\nWithout smallest number: ");
        for(int i = 0; i < nums.length; i++) {
            if(i != index) 
                System.out.print(nums[i] + " ");
        }
    }  
}
