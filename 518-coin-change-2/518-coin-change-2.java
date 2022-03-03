class Solution {
    public int change(int amount, int[] coins) {
        HashMap<String,Integer> hm=new HashMap<>();
        return recursion(coins,amount,0,hm);
    }
    int recursion(int[] coins,int amt,int m,HashMap<String,Integer> hm)
    {
        if(amt==0)
            return 1;
        else if(amt<0 || m==coins.length)
        {
            return 0;
        }
        String Key=amt+"Satyam"+m;
        if(hm.containsKey(Key))
            return hm.get(Key);
        int ans=0;
        
        for(int i=m;i<coins.length;i++)
        {
            if(amt>=coins[i])
           ans=ans+recursion(coins,amt-coins[i],i,hm);
        }
        hm.put(Key,ans);
        return ans;
    }
}