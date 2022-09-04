class Solution {
   // static int ans=0;
    public int numberOfWays(int startPos, int endPos, int k) {
        Map<String,Integer> mp=new HashMap<>();
        return rec(startPos,endPos,k, mp);
    }
    int rec(int startPos,int endPos,int k,Map<String,Integer> mp)
    {
        
        if(k==0 && startPos==endPos)
        {
           return 1;
        }
        if(Math.abs(startPos-endPos)>k)
            return 0;
        String key=startPos+" "+ k;
        if(mp.containsKey(key))
            return mp.get(key);
        if(k<0)
            return 0;
         int op1=rec(startPos+1,endPos,k-1,mp)%1000000007;
         int op2=rec(startPos-1,endPos,k-1,mp)%1000000007; 
        mp.put(key,(op1+op2)%1000000007);
        return mp.get(key);
    }
}