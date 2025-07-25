// ✅ Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array
// 💡 Approach: Two pointer technique – one pointer to place unique elements, the other to iterate.
// ⏱️ Time: O(n), Space: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i =0;
        for(int j=1; j<nums.length; j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
            return i+1;
        }
}
