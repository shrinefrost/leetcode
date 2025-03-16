class Solution {
    public void swap(int[] nums){
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public void nextPermutation(int[] nums) {
        //observation 1 to find the first dip
        int dip =0;
        int dipIndex=0;
        int n = nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                dip++;
                dipIndex =i;
                System.out.println(i);
                break;
            }
        }
        if(dip==0){
            swap(nums);
            return;
        }

        // observation 2 find the integer which will take place at dip index
        for(int i = n-1;i>dipIndex;i--){
            if(nums[i]>nums[dipIndex]){
                int temp = nums[i];
                nums[i] = nums[dipIndex];
                nums[dipIndex]=temp;
                break;
            }
        }

        //observation 3 now arrange the element of the array in smaller to greater

        for(int i=dipIndex+1, j=n-1; i<j; i++,j--){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}