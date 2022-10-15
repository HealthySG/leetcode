class Solution {
    static int fee;
    public int maxProfit(int[] prices, int fee) {
        this.fee=fee;
        Integer[][] dp=new Integer[2][prices.length];
      /*  int buy=Integer,ans=0;
        for(int i=0;i<prices.length;i++)
        {  
            if()
        }*/
        return rec(prices,1,0,dp);
    }
    int rec(int[] prices,int buyorsell,int idx,Integer[][] dp)
    {
         if(idx>=prices.length)
            return 0;
         if(dp[buyorsell][idx]!=null)
            return dp[buyorsell][idx];
        int choice=0;
        if(buyorsell==1)
        {
             int buy=rec(prices,0,idx+1,dp)-prices[idx];
             int notbuy=rec(prices,1,idx+1,dp);
              choice=Math.max(buy,notbuy);
        }
        if(buyorsell==0)
        {
            int sell=rec(prices,1,idx+1,dp)+prices[idx]-fee;
            int notsell=rec(prices,0,idx+1,dp);
            choice=Math.max(sell,notsell);
        }
        dp[buyorsell][idx]=choice;
         return dp[buyorsell][idx];
     //   return choice;
    }
}