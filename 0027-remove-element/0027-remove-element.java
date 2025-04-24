class Solution {
    public int removeElement(int[] nums, int val) {
        int flag =-1;
        for(int  i =0;i<nums.length;i++){
            if(nums[i]==val) {
                flag = i;
                break;
            }
        }
        if(flag==-1) return nums.length;

        for(int j = flag+1;j<nums.length;j++){
            if(nums[j]!=val){
                int temp = nums[j];
                nums[j]=nums[flag];
                nums[flag]=temp;
                flag++;
            }
        }
        return flag;
    }
}