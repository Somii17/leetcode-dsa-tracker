// ✅ Problem: https://leetcode.com/problems/two-sum/
// 💡 Approach: HashMap
// ⏱️ Time: O(n), Space: O(n)

public class TwoSum {
    public int twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
