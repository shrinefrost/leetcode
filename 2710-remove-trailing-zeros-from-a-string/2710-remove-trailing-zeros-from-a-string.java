class Solution {
    public String removeTrailingZeros(String num) {
        String temp = num;
        for(int i = num.length()-1;true;i--){
            if(temp.charAt(i)=='0'){
                temp = temp.substring(0,i);
                
            }
            else{
                break;
            }
        }
        return temp;
        
    }
}