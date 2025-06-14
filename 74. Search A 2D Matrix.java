class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0, right = rows*cols-1;
        while(left<=right){
            int m = left+(right-left)/2;
            int row = m/cols;
            int col = m% cols;
            if(target >matrix[row][col]){
                left = m+1;
            }

            else if(target<matrix[row][col]){
                right = m-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
