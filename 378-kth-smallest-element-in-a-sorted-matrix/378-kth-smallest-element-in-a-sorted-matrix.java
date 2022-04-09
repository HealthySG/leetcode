class Solution {
    public int kthSmallest(int[][] matrix, int k) {
         int m = matrix.length, n = matrix[0].length;
        int low = matrix[0][0], high = matrix[m - 1][n - 1];
        while (low<=high) {
            int mid=(low+(high))>>1;
            int count = 0; 
            int j = n - 1;
            for (int i = 0; i < m; i++) {
                while (j >= 0 && matrix[i][j] > mid)
                    j--; // means in each row we trwverse from backword column if iits less than fromm omid than we consider all it's previous element. 
                count += j + 1;
            }
            if (count < k)
                low = mid + 1;
            else
                high = mid-1;
        }
        return low;
    }
}