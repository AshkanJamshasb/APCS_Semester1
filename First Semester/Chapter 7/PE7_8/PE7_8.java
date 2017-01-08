public class PE7_8 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int random, ranLim = 10;
        for (int i = 0; i < nums.length; i++) {
            random = (int)(Math.random()*ranLim);
            nums[i] = nums2[random];
            for (int j = random; j < nums.length-1; j++) {
                nums2[j] = nums2[j+1];
           	}
           	ranLim--;
        }
        System.out.print("Random numbers from 1-10: ");
        for (int e : nums) {
            System.out.print(e + " ");
        }
    }
}