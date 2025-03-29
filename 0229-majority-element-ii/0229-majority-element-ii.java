class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> res = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int occur = nums.length/3;
        for(int i=0;i<nums.length;i++){
            map.merge(nums[i],1,Integer::sum);
                if(map.get(nums[i])>occur){
                    res.add(nums[i]);
                }
            
        }
        return res.stream().collect(Collectors.toList());
    }
}