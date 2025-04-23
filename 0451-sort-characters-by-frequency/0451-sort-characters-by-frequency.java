class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character>[] list = new ArrayList[s.length()+1];
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            map.merge(s.charAt(i),1,Integer::sum);
        }

        map.forEach((key,value) ->{
            if(list[value]==null){
                list[value]=new ArrayList();
            }
            list[value].add(key);
        });
        for(int i =list.length-1;i>=0;i--){
            if(list[i]!=null){
                for(char c: list[i]){
                    System.out.println("value:" + c);
                    for(int j = 1;j<=i;j++)
                        sb.append(""+c);
                }
            }
        }
        return sb.toString();
    }
}