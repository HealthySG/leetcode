class Solution {
    public int longestCommonSubsequence(String text1, String text2)  {
       int m=text1.length(),n=text2.length();
        int[][] dp=new int[m][n];
        return rec(0,0,text1,text2,dp);
    }
        int rec(int i,int j,String text1,String text2,int[][] dp)
    {
        if(i==text1.length() || j==text2.length())
            return 0;
        if(dp[i][j]!=0)
            return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j))
        {
            dp[i][j]=1+rec(i+1,j+1,text1,text2,dp);
            return dp[i][j];
        }
        else
        {
             dp[i][j]=Math.max(rec(i+1,j,text1,text2,dp),rec(i,j+1,text1,text2,dp));
             return dp[i][j];
        }
    }
}