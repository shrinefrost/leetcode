class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes =0;
        int l=0;
        int r=0;
        int maxLength =0;
        while(r<nums.length){
            if(nums[r]==0){
                zeroes++;
                if(zeroes>k){
                    while(zeroes>k){
                        if(nums[l]==0){
                            zeroes--;
                        }
                        l++;
                    }
                }
            }
            maxLength = Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength;
    }
}