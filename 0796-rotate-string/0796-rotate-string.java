class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            char last = sb.charAt(s.length()-1);
            sb.delete(s.length()-1,s.length());
            sb.insert(0,last);
            //System.out.println(sb.toString());
            if(sb.toString().equals(goal)) return true ;

        }
        return false;

    }
}