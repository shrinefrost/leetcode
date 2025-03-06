class Solution {
    public int missingNumber(int[] nums) {
        int realSum =(nums.length*(nums.length+1))/2;;
        int numsSum=0;

        for(int i=0;i<nums.length;i++){
            numsSum = numsSum + nums[i];
        }
        return realSum-numsSum;

    }
}