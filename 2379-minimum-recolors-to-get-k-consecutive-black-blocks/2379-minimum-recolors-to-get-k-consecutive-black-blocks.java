class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mins=k+1;
        int temp=0;
        int noNeed =0;
        for(int i =0;i<blocks.length(); i++){
            for(int j =i;j<blocks.length();j++){
                if(j+k <=blocks.length()){
                    String block = blocks.substring(j,j+k);
                    temp = 0;
                    noNeed=0;
                    for(int l =0;l<block.length();l++){
                        if(block.charAt(l)=='W'){
                            temp++;    
                        }
                        else{
                            noNeed++;
                        }
                    }
                    if(temp!=0) mins = Math.min(mins,temp);
                    if(noNeed>=k) return 0;
                }
            }
        }
        return mins;
    }
}