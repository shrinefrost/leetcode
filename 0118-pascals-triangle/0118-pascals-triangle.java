class Solution {
    public int nCr(int r, int c) {
        if(c==0) return 1;
        long res = 1L;
        for(int i=0;i<c;i++){
            res = res *(r-i);
            res = res/(i+1);
        }
        return (int)res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempRes = new ArrayList<>();
        for(int i =1;i<=numRows;i++){
            tempRes.clear();
            for(int j =1;j<=i;j++){
                tempRes.add(nCr(i-1,j-1));
            }
            res.add(new ArrayList<>(tempRes));
        }
        return res;
    }
}