class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
         

         reverse(nums, 0 , n-1);
         reverse(nums, 0, k-1);
         reverse(nums , k , n-1);

    }

    public static void reverse(int[] nums, int sp, int ep){
        if (nums == null || nums.length <= 1) return;

        while(sp<ep){
            int temp = nums[sp];
            nums[sp] = nums[ep];
            nums[ep]=temp;
            sp++;
            ep--;
        }
    }
}
