class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int count=0;

        for(int i=0;i<time.length;i++){
            int requirement;
            if(time[i]>60){
                int checker=time[i]%60 + time[i];
                if(checker%60 ==0){
                    requirement = time[i]%60;
                }
                else{
                    requirement = 60-time[i]%60;
                }
            }
            else{
                requirement = 60-time[i]; 
            }
            

            if(set.containsKey(requirement)){
                count+=set.get(requirement);
            }
            set.merge(time[i]%60,1,Integer::sum);

        }
        return count;
        
    }
}