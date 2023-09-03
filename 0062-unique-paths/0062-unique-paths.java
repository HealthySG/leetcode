class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for (int[] row: dp)
           Arrays.fill(row,-1);  
        return help(0,0,m-1,n-1,dp);
    }
    int help(int s,int e,int m,int n,int[][] dp)
    {
        if(s==m && e==n)
            return 1;
        if(s>m || e>n)
            return 0;
        if(dp[s][e]!=-1)
            return dp[s][e];
        int a1=help(s+1,e,m,n,dp);
        int a2=help(s,e+1,m,n,dp);
        dp[s][e]=a1+a2;
        return a1+a2;
    }
    
}