class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] arr =new int[right+1];
        int [] closestPair = new int[2];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =2;i<=right;i++){
            arr[i]=1;
        }

        for(int i =2;i<Math.sqrt(right);i++){
            if(arr[i]==1){
                int temp =i;
                for(int j = i*i;j<=right;j=temp*i){
                        arr[j]=0;
                        temp++;
                    }
                }
                
            }

        for(int i =left;i<=right;i++){
            if(arr[i]==1){
                list.add(i);
            }
        }
            if(list.size()==0 ||list.size()==1 ){
                int[] result = {-1,-1};
                return result;
            }
            else{

                int minDiff=Integer.MAX_VALUE;
                for (int i = 0; i < list.size() - 1; i++) {
                    int diff = list.get(i+1) - list.get(i);

                    // If a smaller difference is found, update the closestPair
                    if (diff < minDiff) {
                        minDiff = diff;
                        closestPair[0] = list.get(i);
                        closestPair[1] = list.get(i + 1);
                    }
                    // If the difference is the same, select the smallest first number
                    else if (diff == minDiff && list.get(i) < closestPair[0]) {
                        closestPair[0] = list.get(i);
                        closestPair[1] = list.get(i + 1);
                    }
                }
            }
            return closestPair;
    }
}