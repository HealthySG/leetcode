class Solution {
    public int minFlipsMonoIncr(String s) {
      int n=s.length(),ac=0,bc=0;
      int[] dp=new int[n];
        if(s.charAt(0)=='0')
            ac++;
        else
            bc++;
      for(int i=1;i<n;i++)
      {
          if(s.charAt(i)=='0')
              dp[i]=Math.min(dp[i-1]+1,bc);
          else
          {
               dp[i]=dp[i-1];
                bc++;
          } 
      }
      return dp[n-1];
    }
}