class Solution {
    public int romanToInt(String s) {
        int sum =0;
        int current = 0;
        int previous =0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            current = map.get(c);
            if(current>previous){
                sum+= current -previous;  
                sum-=previous;  
            }
            else{
                sum+=current;
            }
            previous =current;
         
        }
        return sum;
    }
}