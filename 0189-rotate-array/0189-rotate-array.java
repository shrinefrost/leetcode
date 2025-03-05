class Solution {

    public void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        //optimal approach
        k=k%nums.length; 
        reverse(nums , nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-k-1);
        reverse(nums,0,nums.length-1);



        // k=k%nums.length;
        // for(int i=0;i<k;i++){
        //     int temp = nums[nums.length-1];
        //     for(int j=nums.length-1;j>0;j--){
        //         nums[j]=nums[j-1];
        //     }
        //     nums[0]=temp;
        // }

    }
}