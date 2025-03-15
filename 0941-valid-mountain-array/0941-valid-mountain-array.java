class Solution {
    public boolean validMountainArray(int[] arr) {
        int flag =0;
        int max =arr[0];
        for(int i =1;i<arr.length-1;i++){
            if(arr[i]>max && flag==0 && arr[i+1]<arr[i] ){
                flag++;
            }
            else if(flag==1){
                if(max<=arr[i]) return false;
            }

            if(flag==0){
                if(max>=arr[i]) return false;
            }
            max = arr[i];
        }
        if(flag==1){
            if(arr[arr.length-2]>arr[arr.length-1]) return true;
            else return false;
        }
        else return false;
    }
}