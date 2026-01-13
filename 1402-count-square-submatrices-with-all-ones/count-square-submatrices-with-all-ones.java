class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){

                if (matrix[i][j] > 0 && i >0 && j>0){
                    int min = Math.min(matrix[i-1][j], Math.min(matrix[i][j-1], matrix[i-1][j-1]));
                    matrix [i][j] = min+1;

                }
                res += matrix[i][j];
            }
        }
        return res;
    }
}