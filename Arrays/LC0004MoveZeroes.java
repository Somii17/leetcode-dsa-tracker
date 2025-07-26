// ✅ Problem: https://leetcode.com/problems/move-zeroes/
// 💡 Approach: Two pointer technique – one pointer iterates, the other tracks position to place non-zero values.
// ⏱️ Time: O(n), Space: O(1)

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        
        for (int i=0;i<nums.length;nums++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                 index++;
            }
        }
        
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}

