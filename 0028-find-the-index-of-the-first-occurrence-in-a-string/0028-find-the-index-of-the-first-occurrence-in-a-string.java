class Solution {
    public int strStr(String haystack, String needle){
        int needleSize= needle.length();
        int haySize= haystack.length();
        int diff = haySize- needleSize;
        if(haystack.contains(needle)){
            for(int i =0;i<=diff;i++){
                System.out.println(i);
                if(needle.equals(haystack.substring(i,i+needleSize))){
                    return i;
                }
            }
        }
        else{
            return -1;
        }
        return 0;
    }
}