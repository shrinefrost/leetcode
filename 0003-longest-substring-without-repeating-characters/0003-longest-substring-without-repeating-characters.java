class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        StringBuilder sb = new StringBuilder();
        int count =-1;
        int flag =0;
        for(int j=0;j<s.length();j++){
            sb.setLength(0);
            flag=0;
            for(int i =j;i<s.length();i++){
                if(!sb.toString().contains(""+s.charAt(i))){
                    flag++;
                    count = Math.max(count,flag);
                    sb.append(""+s.charAt(i));
                }
                else{
                    flag=0;
                    break;
                }
            }

        }
        return count;
    }
}