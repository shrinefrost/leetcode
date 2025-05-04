class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        long preSum =0;
        //long mod = 1000000007;
        long min = Integer.MAX_VALUE;
        int size = nums.length;
        int res=0;
        for(int i =0;i<size;i++){
            sum +=nums[i];
            //sum = sum%mod;
        }

        System.out.println(sum);
        for(int i=0;i<nums.length;i++){
            preSum = preSum+(long)nums[i];
            sum = sum -(long)nums[i];
            long last;
            if(i+1==size){
                last =0;
            }
            else{
                last = (sum/(size-(i+1)));
            }

            long temp = Math.abs((preSum/(i+1))-last);

            System.out.println("temp: " + temp + " and i is: " + i);
            
            // System.out.println("preSum: " + preSum);
            if(temp==0) return i;
            if(min>temp){
                res =i;
                min = temp;
            }
            
                
        }
        return res;
    }
}