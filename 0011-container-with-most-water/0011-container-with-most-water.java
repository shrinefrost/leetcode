class Solution {
    public int maxArea(int[] height) {
        int low =0;
        int high = height.length-1;
        int area = -1;

        while(low<=high){
            int length = Math.min(height[low],height[high]);
            int breath = high -low;
            area = Math.max(area,length*breath);
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }

        }
        return area;
        
    }
}