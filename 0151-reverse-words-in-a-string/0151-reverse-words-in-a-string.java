class Solution {

    public int firstChar(String s,int low){
        int index=-1;

        for(int i =low;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp!=' '){
                index =i;
                break;
            }
        }
        return index;
    }
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        int low=0;
        int high=0;
        int i;
        low = firstChar(s,low);
        boolean canAdd=false;
        for(i=low;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp!=' ') canAdd =true;
            if(temp==' ' && canAdd){
                System.out.println(s.substring(low,i));
                sb.insert(0," " + s.substring(low,i));
                low = firstChar(s,i);
                canAdd=false;
            }
        }
        if(i==s.length() && low!=-1){
           sb.insert(0," "+ s.substring(low,i)); 
        }

        return sb.toString().trim();
    }
}