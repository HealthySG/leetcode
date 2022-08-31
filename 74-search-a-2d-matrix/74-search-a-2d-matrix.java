class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0,high=m*n-1;
        while(low <= high)
        {
            int mid=(low+high)>>1;
            int midRow=mid/n;
            int midCol=n- (n*(midRow+1)-mid);
            
            if(target== matrix[midRow][midCol])
            {
                return true;
            }
            else if(target <  matrix[midRow][midCol])
            {
                high =mid-1;
            }
            else if(target > matrix[midRow][midCol])
            {
                low=mid+1;
            }
        
        }
        return false;
    }
}