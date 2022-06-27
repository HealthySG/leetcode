class Solution {
    public int minDistance(String word1, String word2) {
      int m=word1.length(),n=word2.length();
     int[][] dp=new int[m][n];
      return rec(word1,word2,0,0,m,n,dp);  
    }
    int rec(String word1, String word2,int idx1,int idx2,int m,int n,int[][] dp)
    {
        if(idx1==m && idx2==n)
            return 0;
        if(idx1==m && idx2<n)
            return (n)-idx2;
        if(idx2==n && idx1<m)
            return (m)-idx1;
        if(dp[idx1][idx2]!=0)
            return dp[idx1][idx2];
        if(word1.charAt(idx1)==word2.charAt(idx2))
        {
           dp[idx1][idx2]=rec(word1,word2,idx1+1,idx2+1,m,n,dp);
         return dp[idx1][idx2];
        }
        if(word1.charAt(idx1)!=word2.charAt(idx2))
        {
             dp[idx1][idx2]=1+Math.min(rec(word1,word2,idx1+1,idx2,m,n,dp),rec(word1,word2,idx1,idx2+1,m,n,dp));
                    return dp[idx1][idx2];
        }
     return 0;
    }
}