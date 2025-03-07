import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int sum = 0;

        // Initialize HashMap with sum = 0 (for cases where subarray starts from index 0)
        hm.put(0, 1);

        for (int num : nums) {
            sum += num;
            int rem = sum - k;
            
            // Check if prefix sum that results in subarray sum k exists
            if (hm.containsKey(rem)) {
                count += hm.get(rem);
            }
            
            // Store sum frequency instead of index
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}




// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         int count =0;
//         int sum =0;
//         // speacial case 
//         for

//         for(int i=0;i<nums.length;i++){
//             sum = sum+nums[i];
//             if(sum==k){
//                 count ++;
//             }
//             int rem = sum -k;

//             if(hm.containsKey(rem)){
//                 count++;
//             }
//             if(!hm.containsKey(sum)){
//                 hm.put(sum,i);
//             }
//         }
//         return count;
//     }
// }