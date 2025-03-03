class Solution {
    public boolean isFascinating(int n) {
        int[] arr = new int[1000];
        int temp =n;
        int secondMul = temp*2;
        int thirdMul = temp*3;
        while(true){
            if(arr[0]>=1||arr[temp%10]>1 || arr[secondMul%10]>1 || arr[thirdMul]>1){
                return false;
            }
            if(temp>0){
            arr[temp%10]= arr[temp%10]+1;
            temp = temp/10;
            }
            if(secondMul>0){
                arr[secondMul%10]= arr[secondMul%10]+1;
                secondMul = secondMul/10;
            }
            if(thirdMul>0){
                arr[thirdMul%10] =arr[thirdMul%10]+1;
                thirdMul = thirdMul/10;
            }
            else{
                return true;
            }
            

        }

    }
}