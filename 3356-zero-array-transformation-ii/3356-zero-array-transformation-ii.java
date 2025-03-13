class Solution {

    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, left = 0, right = queries.length;

        // Zero array isn't formed after all queries are processed
        if (!currentIndexZero(nums, queries, right)) return -1;

        // Binary Search
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (currentIndexZero(nums, queries, middle)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        // Return earliest query that zero array can be formed
        return left;
    }

    private boolean currentIndexZero(int[] nums, int[][] queries, int k) {
        int n = nums.length, sum = 0;
        int[] differenceArray = new int[n + 1];

        // Process query
        for (int queryIndex = 0; queryIndex < k; queryIndex++) {
            int left = queries[queryIndex][0], right =
                queries[queryIndex][1], val = queries[queryIndex][2];

            // Process start and end of range
            differenceArray[left] += val;
            differenceArray[right + 1] -= val;
        }

        // Check if zero array can be formed
        for (int numIndex = 0; numIndex < n; numIndex++) {
            sum += differenceArray[numIndex];
            if (sum < nums[numIndex]) return false;
        }
        return true;
    }
}


//down is my brute force approach of Time comlexity O(n*q)
// class Solution {
//     public int minZeroArray(int[] nums, int[][] queries) {
//         //counting number of zero in array
//         int countZero=0;
//         int countOperations =0;
//         for(int i =0;i<nums.length;i++){
//             if(nums[i]==0) countZero++;
//             else if(nums[i]<0) return -1;
//         } 
//         if(countZero ==nums.length){
//             return 0;
//         }

//         for(int i =0;i<queries.length;i++){
//             int l = queries[i][0];
//             int r = queries[i][1];
//             int val = queries[i][2];

//             for(int j = l;j<=r;j++){
//                 if(nums[j]>0){
//                     nums[j] = nums[j]-val;
//                     if(nums[j]<=0){
//                         nums[j]=0;
//                         countOperations++;
//                     }
//                 }
//                 if(countOperations == nums.length-countZero){
//                     return i+1;
//                 }
//             }
//         }

//         return -1;
//     }
// }