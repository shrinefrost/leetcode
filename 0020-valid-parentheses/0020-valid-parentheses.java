class Solution {
    public boolean isValid(String s) {
        Stack<Character> stringStack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stringStack.empty() ==true){
                stringStack.push(s.charAt(i));
            }
            else if(stringStack.peek()=='(' && s.charAt(i)==')'){
                stringStack.pop();
            }
            else if(stringStack.peek()=='{' && s.charAt(i)=='}'){
                stringStack.pop();
            }
            else if(stringStack.peek()=='[' && s.charAt(i)==']'){
                stringStack.pop();
            }
            else {
                stringStack.push(s.charAt(i));
            }
        
        }
        return stringStack.empty();
    }
}