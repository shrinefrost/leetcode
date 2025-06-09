class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int maxLength=0;

        while(r<s.length()){
            char flag = s.charAt(r);
            if(!map.containsKey(flag)){
                map.put(flag,r);
            }
            else if(map.containsKey(flag) && map.get(flag)>=l){
                l=map.get(flag)+1;
                map.put(flag,r);
                
            }
            else if(map.get(flag)<l){
                map.put(flag,r);
            }
            maxLength = Math.max(maxLength,(r-l+1));
            r++;
            //System.out.println(maxLength);
            
        }
        return maxLength;
    }
}