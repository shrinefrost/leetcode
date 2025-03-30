class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Set<Integer> res = new HashSet<>();
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int occur = nums.length/3;
        // for(int i=0;i<nums.length;i++){
        //     map.merge(nums[i],1,Integer::sum);
        //         if(map.get(nums[i])>occur){
        //             res.add(nums[i]);
        //         }
            
        // }
        // return res.stream().collect(Collectors.toList());

        //optimal approach for this is:
        List<Integer> res = new ArrayList<>();
        int count1 =0; int count2=0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int occur = (int)nums.length/3+1;
        int n = nums.length;

        for(int i =0 ;i<n;i++){
            if(count1==0 && nums[i]!=ele2 ) {
                ele1 = nums[i];
                count1=1;
            }
            else if(count2==0 && nums[i]!=ele1){
                ele2 =nums[i];
                count2 =1;
            }
            else if(nums[i]==ele1){
                count1++;
            }
            else if(nums[i]==ele2){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
    count1 =0; count2=0;
    for(int i =0;i<nums.length;i++)
    {
        if(nums[i]==ele1) count1++;
        if(nums[i]==ele2) count2++;
    }
    if(count1>=occur) res.add(ele1);
    if(count2>=occur) res.add(ele2);
    return res;
    }
}