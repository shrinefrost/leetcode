class Solution {

    public int checkDeck(int[] weights,int cap) {
        int days =1; 
        int load = 0;
        for(int i =0;i<weights.length;i++){
            if(load + weights[i]>cap){
                days+=1;
                load = weights[i];
            }
            else{
                load = load+weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum= 0;
        int max = weights[0];

        for(int i =0;i<weights.length;i++){
            sum+=weights[i];
            if(weights[i]>max){
                max=weights[i];
            }
        }
        int low = max;
        int high = sum;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            int ans = checkDeck(weights,mid);
            
            if(ans>days){
                low = mid+1;
            }
            else if(ans<days){
                high = mid-1;
            }
            else{
                break;
            }
        }
        return mid;
    }
}