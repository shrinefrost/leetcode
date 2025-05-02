class Solution {
    public int myAtoi(String s) {
        long sum =0;
        boolean isNegative = false;
        boolean isEntered = false;
        for(int i =0;i<s.length();i++){
            long val = s.charAt(i) - '0';
            if(s.charAt(i)!= ' ' && s.charAt(i)!='-' && (val<0 || val>9) &&s.charAt(i)!= '+') break;
            if(s.charAt(i)== ' ' && !isEntered){continue;}
            if(s.charAt(i)=='-' && !isEntered) {isNegative = true;isEntered =true; continue;}
            if(s.charAt(i)=='+' && !isEntered) { isEntered =true; continue;}
            
            if(val>=0 && val<=9){
                sum = sum*10+val;
                isEntered =true;
                if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE){
                    if(isNegative)
                        return Integer.MIN_VALUE;
                    else return Integer.MAX_VALUE;
                }
                
            }
            else if(isEntered){
                break;
            }
        }
        if(isNegative) {
            sum = 0-sum;
        }
        System.out.println(sum);
        System.out.println(isNegative);

        return (int)sum;
    }

}