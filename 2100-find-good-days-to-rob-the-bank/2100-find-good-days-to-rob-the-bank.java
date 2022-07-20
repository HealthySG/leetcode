class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> ans=new ArrayList<>();
        if(time==0)
        {
            for(int i=0;i<security.length;i++)
           {
             ans.add(i);
           }
             return ans;
        }
          
        int[] pref=new int[security.length];
        int[] suff=new int[security.length];
        pref[0]=1;
        suff[security.length-1]=1;
        int cnt=1;
        for(int i=1;i<security.length;i++)
        {
            if(security[i]<=security[i-1])
               cnt++;
            else
              cnt=0;
            pref[i]=cnt;
        }
        cnt=1;
         for(int i=security.length-2;i>=0;i--)
        {
            if(security[i]<=security[i+1])
              cnt++;
            else
              cnt=0;
            suff[i]=cnt;
        }
        for(int i=time;i<security.length-time;i++)
        {
            if(pref[i]>=time && suff[i]>=time)
              ans.add(i);
        }
        return ans;
    }
}