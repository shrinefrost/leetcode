class Solution {
    public int maxSubArray(int[] nums) {
        int maxiSum = Integer.MIN_VALUE;
        int sum =0;
        int maxi =nums[0];

        for(int i=0;i<nums.length;i++){
            if(maxi<nums[i]) maxi = nums[i];
            sum = sum+nums[i];
            if(sum>=0){
                maxiSum = Math.max(maxiSum,sum);
            }
            else{
                sum =0;
            }
        }
        if(maxiSum == Integer.MIN_VALUE) return maxi;
        else return maxiSum;
    }
}