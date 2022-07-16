/*class Solution {
    int[] dir=new int[]{0, 1, 0, -1, 0};
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
     return rec(m,n,maxMove,startRow,startColumn);
    }
    int rec(int m,int n,int maxMove, int currrow, int currcol)
    {
        if(currrow<0 || currrow==m || currcol<0 || currrow==n)
            return 1;
        if(maxMove==0)
            return 0;
        int ans=0;
         for(int i=0;i<4;i++)
         {
             ans+=rec(m,n,maxMove-1,currrow+dir[i],currcol+dir[i+1]);
            
         }
       //  System.out.println("ans for move dir i" + ans);
        return ans;
    }
}*/
class Solution {
    Integer[][][] memo;
    int m, n;
    int[] DIR = new int[]{0, 1, 0, -1, 0};
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo = new Integer[m][n][maxMove+1];
        this.m = m; this.n = n;
        return dp(startRow, startColumn, maxMove);
    }
    int dp(int r, int c, int maxMove) {
        if (r < 0 || r == m || c < 0 || c == n) return 1; // Out of bound -> Count 1 way
        if (memo[r][c][maxMove] != null) return memo[r][c][maxMove];
        if (maxMove == 0) return 0;
        int ans = 0;
        for (int i = 0; i < 4; ++i) {
            ans = (ans + dp(r + DIR[i], c + DIR[i + 1], maxMove - 1)) % 1000000007;
        }
        return memo[r][c][maxMove] = ans;
    }
}