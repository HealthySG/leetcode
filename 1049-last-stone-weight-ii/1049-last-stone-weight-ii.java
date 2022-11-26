class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum1=0,sum2=0;
         int sumStWt = 0;
        for(int stone : stones){
            sumStWt += stone;
        }
        Integer[][] dp = new Integer[stones.length][sumStWt];
      return rec(stones,0,sum1,sum2,dp);
    }
    int rec(int[] stones,int idx,int sum1,int sum2,Integer[][] dp)
    {
        if(idx==stones.length)
            return Math.abs(sum1-sum2);
        if(dp[idx][sum1]!= null) {
            return dp[idx][sum1];
        }
         dp[idx][sum1]=Math.min(rec(stones,idx+1,sum1+stones[idx],sum2,dp),rec(stones,idx+1,sum1,sum2+stones[idx],dp));
        return dp[idx][sum1];
    }
}