class Solution {
    public void setZeroes(int[][] matrix) {
        /* this is the better approach with TC = o(2mn) and space: O(m)+O(n) */
        /* so for optimal approach we cannot improve TC we can improve SC to O(1) */
        /*LET'S see HOW?*/
        /*
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rows = new int[row];
        Arrays.fill(rows,0);
        int[] cols = new int[col];
        Arrays.fill(cols,0);

        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(rows[i]==1||cols[j]==1){
                    matrix[i][j]=0;
                }
            }
        }*/


        /* ##Optimal approach with constant time space  */
        /** here we are storing the information of 0's in inside the given matrix only we
        will be using the matrix first row and first column and an extra variable to store element at (0,0) 
        */

        int rows = matrix.length;
        int cols = matrix[0].length;
        int common = matrix[0][0];
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if((i==0 || j==0) && matrix[i][j]==0){
                    common =0;
                }
                else {
                    if(matrix[i][j]==0){
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
            }
        }

        for(int i =1;i<rows;i++){
            for(int j =1;j<cols;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0 ) {
                    matrix[i][j]=0;
                }
            }
        }

        for(int i =cols-1;i>=0;i--){
            if(common==0) matrix[0][i]=0;
        }
        for(int i =rows-1;i>=0;i--){
            if(common==0) matrix[i][0]=0;
        }


    }
}