class Solution {
    public int countSquares(int[][] matrix) {
        int ans=0,c=0;
         int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
             for(int j=0;j<matrix[0].length;j++)
             {
                 if(matrix[i][j]==1)
                 {
                     
                     c=rec(i,j,matrix,dp);
                     
                 //    System.out.println("c for i and j "+ c + " "+ i+ " "+ j);
                     ans+=c;
                 }
             }
        }
        return ans;
    }
    int rec(int i,int j,int[][] matrix,int[][] dp)
    {
        if(i>=matrix.length || j>=matrix[0].length|| matrix[i][j]==0)
            return 0;
         if(dp[i][j]!=0)
            return dp[i][j];
        
        int temp=Math.min(rec(i+1,j,matrix,dp),rec(i,j+1,matrix,dp));
        int subans=1+Math.min(temp,rec(i+1,j+1,matrix,dp));
         dp[i][j]=subans;
        return subans;
    }
}