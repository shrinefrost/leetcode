public class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Count the number of times nums[i-1] > nums[i]
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }

        // Check for the rotation wrap-around: last > first
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        // Return true if there's at most one violation
        return count <= 1;
    }
}
