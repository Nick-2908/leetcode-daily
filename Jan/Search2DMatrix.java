class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        return binarySearch(matrix, target, 0, m * n - 1, n);
    }

    public boolean binarySearch(int[][] matrix, int target, int low, int high, int cols){
        if(low>high) return false;

        int mid=low+(high-low)/2;

        int r=mid/cols;
        int c=mid%cols;

        if(matrix[r][c]==target) return true;
        else if(matrix[r][c]<target)
            return binarySearch(matrix, target, mid + 1, high, cols);
        else
            return binarySearch(matrix, target, low, mid - 1, cols);
    }
}