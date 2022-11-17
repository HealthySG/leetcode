class Solution {
    public int[] findPeakGrid(int[][] mat) {
//         int low=0,high=mat[0].length-1;
//         int[] res=new int[2];
//         while(low<=high)
//         {
//             int mid=(low+high)/2;
            
//             int max_row=-1;
//             int max_num=Integer.MIN_VALUE;
//             for(int j=0;j<mat.length;j++)
//             {
//                 if(mat[j][mid]>max_num)
//                 {
//                     max_num=mat[j][mid];
//                     max_row=j;
//                 }
//             }
//             if((mid==0 || mat[max_row][mid-1]<mat[max_row][mid]) && (mid==mat.length-1 || mat[max_row][mid+1]<mat[max_row][mid]))
//             {
//                 res[0]=max_row;
//                 res[1]=mid;
//                 return res;
//             }
//             else if(mid>0 && mat[max_row][mid-1]>mat[max_row][mid])
//             {
//                 high=mid-1;
//             }
//             else
//             {
//                 low=mid+1;
//             }
//         }
//          res[0]=-1;
//          res[1]=-1;
//         return res;
        int n = mat.length, m = mat[0].length, lo = 0, hi = m - 1, mid; 
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            int max_row = 0;
            for (int i = 0; i < n; ++i) {
                if (mat[max_row][mid] < mat[i][mid])
                    max_row = i;
            }
            if ((mid == 0 || mat[max_row][mid] > mat[max_row][mid - 1]) && 
                (mid == m - 1 || mat[max_row][mid] > mat[max_row][mid + 1]))
                return new int[] {max_row, mid};
            else if (mid > 0 && mat[max_row][mid - 1] > mat[max_row][mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return new int[] {-1, -1};
    }
}