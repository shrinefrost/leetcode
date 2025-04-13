class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int second =0;
        int last =0;

        for(int i =0;i<=nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            second = i+1;
            last = nums.length-1;
            while(second <last){
                int sum = nums[i] + nums[second] +nums[last];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[second],nums[last]));
                    second++;
                }
                else if(sum>0){
                    while(second<=last){
                        if(nums[last]!=nums[last-1]){
                            last--;
                            break;
                        }
                        last--; 
                    }
                    
                }
                else if(sum<0){
                    while(second<last){
                        if(nums[second]!=nums[second+1]){
                            second++;
                            break;
                        }
                        second++;
                    }
                }
            }
        }
        return list;
    }
}