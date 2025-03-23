class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length>nums2.length ? nums2.length:nums1.length;
        int [] temp = new int[n];
        if(nums1.length>nums2.length){
             System.arraycopy(nums2, 0, temp, 0, nums2.length);
        }
        else{
            System.arraycopy(nums1, 0, temp, 0, nums1.length);
        }
        
       
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    temp[j] = -1;
                    break;
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}