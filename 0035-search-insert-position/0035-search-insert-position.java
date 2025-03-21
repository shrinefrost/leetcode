class Solution {
    public int searchInsert(int[] arr, int x) {
        int low =0;
        int high =arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low +high)/2;
            if(arr[mid]>=x){
                high = mid-1;
                ans = mid;
            }
            else{
                low =mid+1;      
            }
        }
        return ans;
    }
}