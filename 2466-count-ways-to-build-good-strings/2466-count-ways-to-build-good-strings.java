class Solution {
    int mod=1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
        int sum=0;
        int[] dp=new int[100001];
        Arrays.fill(dp,-1);
        for(int i=low;i<=high;i++)
        {
            sum=(sum%mod+rec(i,one,zero,dp)%mod)%mod;
        }    
        return sum;
    }
    int rec(int target,int one,int zero,int[] dp)
    {
        if(target==0)
            return 1;
        if(target<0)
            return 0;
        if(dp[target]!=-1)
            return dp[target];
        dp[target]=(rec(target-one,one,zero,dp)%mod+rec(target-zero,one,zero,dp)%mod)%mod;
        return dp[target]%mod;
    }
}