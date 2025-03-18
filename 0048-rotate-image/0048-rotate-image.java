class Solution {
    public void reverse(int[][]matrix,int i ,int j){
        int end =j;
        int start =0;
        while(start<end){
            int swap = matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end] = swap;
            end--;
            start++;
        }
    }
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        //transpose of the matrix;
        for(int i =0;i<rows;i++){
            for(int j=i;j<cols;j++){
                if(i!=j){
                    int swap = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=swap;
                }
            }
        }

        //reverse the array
        for(int i =0;i<rows;i++){
            reverse(matrix,i,cols-1);
        }
        


    }
}