
class Solution {
    public int maximum(int [] arr){
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int max = maximum(arr);
        int j =0;
        for(int i =1; i<=max;i++){
            if(j<= arr.length && arr[j]!=i){
                list.add(i);
            }
            else{
                j++;
            }
        }
        for(int i =max+1;i<=max+1000;i++){
            list.add(i);
        }
        System.out.println(arr.length);
        System.out.println(list.size());
        return list.get(k-1);

    }
}