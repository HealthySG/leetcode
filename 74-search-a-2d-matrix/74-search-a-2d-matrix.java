class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,l=matrix[0].length-1,j=l;
        int s=matrix.length-1;
        while(i<=s && j>=0)
        {
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]>target)
               j--;
            else 
                i++;
        }
        return false;
    }
}