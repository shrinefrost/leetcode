class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        
        //finding lower bound;
        int ansLow =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                if(mid>0 && nums[mid-1]==target){
                    high = mid-1;
                    ansLow =high;
                }
                else{
                    ansLow =mid;
                    break; 
                }
            }
            if(nums[mid]<target){
                low =mid+1;
            }
            else{
                high = mid-1;
            }

        }
        //finding uper bound;
        int ansHigh =-1;
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                if(mid+1<nums.length && nums[mid+1]==target){
                    low = mid+1;
                    ansHigh =low;
                }
                else{
                    ansHigh =mid;
                    break; 
                }
            }
            if(nums[mid]<target){
                low =mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return new int[]{ansLow,ansHigh};

    }
}