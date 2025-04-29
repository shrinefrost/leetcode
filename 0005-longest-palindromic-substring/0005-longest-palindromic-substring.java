class Solution {
    public boolean isPalindrome(String s , int i ,int j){
            while(i<=j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
    }
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        int max =-1;
        for(int i=0;i<s.length();i++){
            for(int j =i;j<s.length();j++){

                if(isPalindrome(s,i,j)){
                    if((j-i)+1>=max){
                        sb.delete(0,sb.length());
                        sb.insert(0,s.substring(i,j+1));
                        max = j-i+1;
                    }
                }
            }
        }
        return sb.toString();
    }
}