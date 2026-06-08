class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int high = m*n-1;
        int low = 0;

        while(low <= high) {
            int mid = low + (high - low)/2;

            int curr = matrix[mid/n][mid%n];
            if(curr == target) {
                return true;
            }
            
            if(curr > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        } 
        return false;
    }
}
