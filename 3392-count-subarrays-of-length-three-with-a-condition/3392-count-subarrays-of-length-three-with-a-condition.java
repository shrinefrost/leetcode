class Solution {
    public int countSubarrays(int[] nums) {
        int count =0;
        int low =0;
        int mid =1;
        int high =2;

        while(high<nums.length){
            int check = (nums[low] + nums[high])*2;
            if(check==nums[mid]) count++;
            low++;high++;mid++;
        }

        return count;
    }
}