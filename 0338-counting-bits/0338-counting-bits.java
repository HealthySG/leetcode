class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        if(n==0)
        {
           dp[0]=0;
            return dp;
        }
        if(n==1)
        {
            dp[0]=0;
            dp[1]=1;
             return dp;
        }
        if(n>1)
        {
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            if((i&1)==0)
                dp[i]=dp[i/2];
            else
                dp[i]=dp[i-1]+1;
        }
      
        }
          return dp;
        }
    }