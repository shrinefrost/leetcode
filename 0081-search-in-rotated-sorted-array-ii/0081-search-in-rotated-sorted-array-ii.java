class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = (high+low)/2;
            //means left portion is sorted 
            if(nums[mid]==target) return true;
            if(nums[low]==nums[high] && nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[mid]>=nums[low]){
                if(nums[mid]>target && nums[low]<=target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[high]>=target){
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }
        return false;
    }
}