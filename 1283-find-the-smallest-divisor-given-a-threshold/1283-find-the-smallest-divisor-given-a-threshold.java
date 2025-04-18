class Solution {
    public int sumDiv (int[] nums,int mid){
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum+= Math.ceil((double)nums[i]/(double)mid);
        }
        System.out.println("sum: " + sum + " mid: " + mid);
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int high = Arrays.stream(nums).max().getAsInt();
        int low  = 1;
        int result=Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int ans = sumDiv(nums,mid);
            if(ans<=threshold) {
                high = mid-1;
                result = Math.min(result,mid);
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }
}