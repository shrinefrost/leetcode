public class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int violation = 0;

        for ( int i =0 ; i<nums.length; i++) {
            if(nums[i]>nums[(i+1)%nums.length]){
                violation++;
                if(violation>1) return false;
            }
        }
        return true;





        // // Count the number of times nums[i-1] > nums[i]
        // for (int i = 1; i < n; i++) {
        //     if (nums[i - 1] > nums[i]) {
        //         count++;
        //     }
        // }

        // // Check for the rotation wrap-around: last > first
        // if (nums[n - 1] > nums[0]) {
        //     count++;
        // }

        // // Return true if there's at most one violation
        // return count <= 1;
    }
}
