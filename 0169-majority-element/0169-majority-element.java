class Solution {
    public int majorityElement(int[] nums) {
        /* MOORE'S VOOTING ALGORITHM*/
        int ele =nums[0];
        int count =1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]==ele) count++;
            else{
                count--;
                if(count==0) {ele = nums[i];count++;}
            }
        }
        return ele;

        /*HashMap<Integer ,Integer> hash = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hash.merge(nums[i],1,Integer::sum);
        }
        for (Integer key : hash.keySet()) {
            if(hash.get(key)>n/2){
                return key;
            }
        }
        return 0; */

        
    }
}