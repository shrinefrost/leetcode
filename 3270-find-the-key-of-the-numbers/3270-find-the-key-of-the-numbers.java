class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1;
        String s2;
        String s3;
        int[] arr = new int[4];
        String result="";
        if(num1<=9){
            s1 = "000"+num1;
        }
        else if(num1<=99){
            s1= "00"+num1;
        }
        else if(num1<=999){
            s1="0"+num1;
        }
        else{
            s1="0000";
        }
        //for num2 
        if(num2<=9){
            s2 = "000"+num2;
        }
        else if(num2<=99){
            s2= "00"+num2;
        }
        else if(num2<=999){
            s2="0"+num2;
        }
        else{
            s2 ="0000";
        }
        //for num3 
        if(num3<=9){
            s3 = "000"+num3;
        }
        else if(num3<=99){
            s3= "00"+num3;
        }
        else if(num3<=999){
            s3="0"+num3;
        }
        else{
            s3="0000";
        }
        for(int i=0;i<4;i++){
            int index1 = s1.charAt(i)-'0';
            int index2 = s2.charAt(i)-'0';
            int index3 = s3.charAt(i)-'0';
            arr[i]=Math.min(index1,Math.min(index2,index3));
            result = result + arr[i];
        }
        return Integer.parseInt(result);
        
    }

}