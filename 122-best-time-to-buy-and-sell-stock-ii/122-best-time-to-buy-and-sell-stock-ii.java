class Solution {
    public int maxProfit(int[] prices) {
        int currBuyprice=prices[0],currprofit=0,prevprofit=0,totprofit=0;
        if(prices.length==1)
        {
            return 0;
        }
        for(int i=1;i<prices.length;i++)
        {
            if(currBuyprice>prices[i])
            {
                totprofit+=prevprofit;
                prevprofit=0;
                currBuyprice=prices[i]; 
            }
            else
            {
                currprofit=prices[i]-currBuyprice;
                if(currprofit<=prevprofit)
                {
                    totprofit+=prevprofit;
                    currBuyprice=prices[i];
                    prevprofit=0;
                }
                else
                {
                    prevprofit=currprofit;
                }
            }
        }
        return totprofit+=prevprofit;
    }
}