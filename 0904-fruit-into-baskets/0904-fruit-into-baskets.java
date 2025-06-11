class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0,r=0,maxLength =0;
        
        while(r<fruits.length){
            map.merge(fruits[r],1,Integer::sum);
            if(map.size()<3){
                maxLength = Math.max(maxLength,r-l+1);  
            }
            else{
                    map.put(fruits[l],map.get(fruits[l])-1);
                    if(map.get(fruits[l])==0) {
                        map.remove(fruits[l]);
                    }
                    l++;                    
            }
            r++;
        }
        return maxLength;
    }
}