class Solution {
    //static int max_profit=Integer.MIN_VALUE;
    public int maxProfit(int[] prices) {
        Integer[][] dp=new Integer[2][prices.length];
       return  rec(0,prices,0,dp);
    }
    int rec(int idx,int[] prices,int buyorsell,Integer[][] dp)
    { 
        if(idx>=prices.length)
            return 0;
        if(dp[buyorsell][idx]!=null)
            return dp[buyorsell][idx];
        int choice=0;
        if(buyorsell==0)
        {
             int buy=rec(idx+1,prices,1,dp)-prices[idx];
             int notbuy=rec(idx+1,prices,0,dp);
             choice=Math.max(buy,notbuy);
        }
        else
        {
             int sell=rec(idx+2,prices,0,dp)+prices[idx];
             int notsell=rec(idx+1,prices,1,dp);
             choice=Math.max(sell,notsell);
        }
         dp[buyorsell][idx]=choice;
         return dp[buyorsell][idx];
    }
    
}