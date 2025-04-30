class Solution {

    public long sum(int[] arr,int low,int high){
        long polySum=0;
        for(int i =0;i<=high;i++){
            polySum = polySum+arr[i];
        }
        return polySum;
    }
    public long largestPerimeter(int[] nums) {
        if(nums.length<=2) return -1;
        Arrays.sort(nums);
        long perimeter =-1;
        int low = 0;
        int high = nums.length-1;
        while(high-low+1>=3){
            long sumP = sum(nums,0,high);
            while(low<=high){
                System.out.println("low: "+ low + " high:" + high);
                int mid = (low+high)/2;
                if(sumP-(long)nums[mid]>(long)nums[mid]){
                    low=mid+1;
                    perimeter =sumP;
                }
                else{
                    perimeter = -1;
                    high = mid-1;
                    low=0;
                    break;
                }
            }
            if(perimeter!=-1) break;
        }
        return perimeter;
    }
}