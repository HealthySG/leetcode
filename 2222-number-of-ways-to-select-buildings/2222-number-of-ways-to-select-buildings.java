class Solution {
    public long numberOfWays(String s) {
        
        int l=s.length();
        int totcoun1=0,totcount0=0,curr1=0,curr0=0;
        long ans=0;
        for(int i=0;i<l;i++)
        {
          if(s.charAt(i)-'0'==1)
          {
              totcoun1++;
          }
        }
        totcount0=l-totcoun1;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)-'0'==0)
            {
                ans+=((curr1)*(totcoun1-curr1));
                curr0++;
            }
            else 
            {
                ans+=(curr0)*(totcount0-curr0);
                curr1++;
            }
        }
        return ans;
    }
    /*long rec(String s,int l,int idx,String ans)
    {
        if(ans.equals("010"))
        {
            return 1;
        }
        for(int i=idx;i<l;i++)
        {
            String ans="";
            if(prev=null || prev=='0' && s.charAt(i)=='1')
            {
               String ans=s.charAt(i)+"";
               
            }
            ans=1+rec(s,l,i+1,ans);
            
        }
        return ans;
    
    }
    */
}