class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length;
        int j = matrix[0].length;
        int start = 0;
        int end = i*j-1;

        while (start <= end ){
            int mid = (start+end)/2;
            int mmid = matrix[mid/j][mid%j];

            if (mmid == target){
            return true ;
            }
            else if (mmid < target ){
                 start = mid + 1;
            }
            else {
                end = mid-1;
            }

        }
        return false  ;
    }
}