class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = Arrays.stream(candies).max().getAsInt();
        long ans = 0;
        
        while (left <= right) {
            long mid = (left+right)/2;
            long count = 0;
            
            for (int c : candies) {
                count += c / mid;
            }
            
            if (count >= k) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return ans;
    }
}
