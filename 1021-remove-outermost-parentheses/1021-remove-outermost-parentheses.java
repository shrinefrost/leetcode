class Solution {
    public String removeOuterParentheses(String s) {
        int counter =0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(counter==0) {
                    counter++;
                    continue;
                    }
                counter++;
            }
            else{
                counter--;
            }

            if(i>0 && counter!=0){
                sb.append(s.charAt(i));
            }
        }
        if(counter==0) return sb.toString();
        else return "";
    }
}