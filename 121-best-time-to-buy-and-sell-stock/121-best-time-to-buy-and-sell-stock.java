class Solution {
    public int maxProfit(int[] prices) {
          int currbuy=Integer.MAX_VALUE,ans=0;
      for(int i=0;i<prices.length;i++)
      {
          if(currbuy>prices[i])
          {
              currbuy=prices[i];
             // currbuy=0;
          } 
          ans=Math.max(ans,prices[i]-currbuy);
      }
        return ans;
    }
}