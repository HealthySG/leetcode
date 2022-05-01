class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       
        
       // Arrays.fill
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
         int[][] dp=new int[m][n];
        
            for(int[] i:dp)
            {
                Arrays.fill(i,-1);
            }
        if(obstacleGrid[m-1][n-1]==1)
            return 0;
        else
        {
         return rec(0,0,m-1,n-1,obstacleGrid,dp);
        }
        
    }
    int rec(int s,int e,int r,int c,int[][] obstacleGrid,int[][] dp)
    {
        if(s==r &&  e==c)
            return 1;
        if(s>r || e>c || obstacleGrid[s][e]==1)
            return 0;
        if(dp[s][e]!=-1)
            return dp[s][e];
        int a1=rec(s+1,e,r,c,obstacleGrid,dp);
        int a2=rec(s,e+1,r,c,obstacleGrid,dp);
        dp[s][e]=a1+a2;
        return a1+a2;
    }
}