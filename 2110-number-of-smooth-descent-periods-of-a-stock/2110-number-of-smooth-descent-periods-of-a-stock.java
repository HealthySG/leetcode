class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long ans=0,c=1;
        boolean flag=false;
        for(int i=1;i<n;i++)
        {
            if(prices[i-1]-prices[i]==1)
            {
                c++;
            }
            else
            {
                ans+=((c)*(c+1))/2;
                c=1;
            }
        }
        
             return ans+((c)*(c+1))/2;
    }
}