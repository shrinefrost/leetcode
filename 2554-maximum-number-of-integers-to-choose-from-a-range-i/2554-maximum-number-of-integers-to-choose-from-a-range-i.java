class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<banned.length;i++){
            map.put(banned[i],i);
        }

        int count=0;
        long sum =0;
        for(int i =1;i<=n;i++){
            if(!map.containsKey(i)){
                if( (sum+(long)i)>maxSum){
                    break;
                }
                sum = sum + (long)i;
                count++;
            }
        }
        return count;
    }
}