class Solution {
    public void swap(int start ,int end,int[] nums){
        int temp = nums[start];
        nums[start] =nums[end];
        nums[end]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int i=0;
        int high = nums.length-1;
        int swap;

        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++; mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                //means element is 2 
                swap(mid,high,nums);
                high--;
            }
        }
    }
}