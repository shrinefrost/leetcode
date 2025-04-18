import java.util.Collections;
class Solution {

    public int possibleBloom(int[] arr,int m,int k,int day){
        int count =0;
        int ans =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<=day) {
                count++;
            }
            else{
                ans = ans + count/k;
                count =0;
            }
        }
        System.out.println("no of bouquets are for mid value: "+day+ " " +ans);
        if(count!=0) {
            ans = ans+count/k;
        }
        return ans;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        System.out.println(m*k);
        System.out.println(bloomDay.length);
        if((long)m*k>(long)bloomDay.length) return -1;

        int max = Arrays.stream(bloomDay).max().getAsInt();
        int min  = Arrays.stream(bloomDay).min().getAsInt();
        System.out.println(min);
        System.out.println(max);

        int low = min;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;
            int ans =possibleBloom(bloomDay,m,k,mid);
            if(ans<m){
                low = mid+1;
            }
            else{
                high =mid-1;
            }
        }
        return low;
    }

}