class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        HashMap<Integer,Integer> leftHash = new HashMap<>();
        HashMap<Integer,Integer> rightHash = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int diff[] = new int[n];
        Arrays.fill(diff,Integer.MAX_VALUE);

        
        for(int i =0;i<n*2;i++){
            if(leftHash.containsKey(nums[i%n])){
                diff[i%n] = i - leftHash.get(nums[i%n]);
            }
            leftHash.put(nums[i%n],i);
        }
        for(int i =2*n-1;i>=0;i--){
            if(rightHash.containsKey(nums[i%n])){
                diff[i%n] = Math.min(diff[i%n],rightHash.get(nums[i%n])-i%n);
            }
            rightHash.put(nums[i%n],i);
        }

        for(int i =0;i<diff.length;i++) {
            System.out.println(diff[i]);
        }
        for(int q:queries){
            list.add(diff[q] >=n ? -1:diff[q]);
        }

        return list;

    }
}