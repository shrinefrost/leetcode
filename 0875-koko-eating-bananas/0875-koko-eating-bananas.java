class Solution {
    public int eatingRate(int[] piles,int mid){
        int sum =0;
        for(int i =0;i<piles.length;i++){
            sum+= Math.ceil((double)piles[i]/(double) mid);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i =1;i<piles.length;i++){
            if(max<piles[i]) max = piles[i];
        }

        int low = 1;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;
            int ans = eatingRate(piles,mid);
            if(ans<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}