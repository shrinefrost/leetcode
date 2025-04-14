class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int second =0;
        int last =0;
        int sum=0;

        for(int i=0 ;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j =i+1;j<nums.length-1;j++){
                if(j>i+1 && nums[j-1]==nums[j]) continue;
                last = nums.length-1;
                second =j+1;
                while(second<last){
                    sum = nums[i] + nums[j] +nums[last] +nums[second];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[second],nums[last]));
                        while(second<last) {
                            if(nums[second]!=nums[second+1]){
                                second++;
                                break;
                            }
                            second++;
                        }
                    }
                    else if(sum>target){
                        while(second<last){
                            if(nums[last]!=nums[last-1]){
                                last--;
                                break;
                            }
                            last--;
                        }
                    }
                    else{
                        while(second<last) {
                            if(nums[second]!=nums[second+1]){
                                second++;
                                break;
                            }
                            second++;
                        }     
                    }
                }
            }          
        }
        return list;
    }
}