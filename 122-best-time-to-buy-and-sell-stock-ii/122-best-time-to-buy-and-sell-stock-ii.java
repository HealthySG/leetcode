class Solution {
    public int maxProfit(int[] prices) {
        int msf=prices[0],currprofit=0,p=0,tot=0;
        if(prices.length==1)
        {
            return 0;
        }
        for(int i=1;i<prices.length;i++)
        {
            if(msf>prices[i])
            {
                tot+=p;
                msf=prices[i];
                 p=0;
            }
            else
            {
                currprofit=prices[i]-msf;
                if(currprofit<=p)
                {
                    tot+=p;
                    p=0;
                    msf=prices[i];
                    
                   
                }
                else
                {
                    p=currprofit;
                }
                    
            }
        }
        return tot+=p;
    }
}