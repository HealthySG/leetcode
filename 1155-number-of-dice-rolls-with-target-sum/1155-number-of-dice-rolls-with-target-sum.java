class Solution {
    static int face;
    static int mod=1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        //Long[][] dp=new Long[30][1000];
         Integer[][] dp=new Integer[30][1000];
        this.face=k;
         return (int)rec(n-1,target,dp);
    }
    int rec(int dice,int target,Integer[][] dp)
    {
         if(dice<0)
             return 0;
        if(dice==0 && target<=face)
        {
            return 1;
        }
        
            
        if(dp[dice][target]!=null)
            return dp[dice][target];
        int ans=0;
        for(int i=1;i<=face;i++)
        {
            if(target-i>0)
              ans=(ans+rec(dice-1,target-i,dp)%mod)%mod;
        }
        dp[dice][target]=ans;
        return  dp[dice][target];
    }
}