class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        int longest= Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();

        //adding the element to the set 
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i :set){
            int pre = i-1;
            if(!set.contains(pre)){
                int count =1;
                int temp =i+1;
                while(set.contains(temp)){
                    count++;
                    temp =temp+1;
                }
                longest = Math.max(longest,count);
            }

        }
        return longest;
    }
}