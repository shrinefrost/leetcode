class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
        }

        for(int i =0;i<t.length();i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),s.charAt(i));
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
        }

        for(int i=0;i<t.length();i++){
            if(map2.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
        }
        
    return true;

    }
}