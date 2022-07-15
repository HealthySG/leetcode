class Solution {
    public int maxProfit(int[] prices) {
        int msf=prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++)
        {
             if(prices[i]<msf)
             {
                 msf=prices[i];
             }
             else if(prices[i]-msf>maxp)
             {
                 maxp=prices[i]-msf;
             }
        }
        return maxp;
    }
}