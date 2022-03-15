class Solution {
    public int numSplits(String s) {
        Map<Character,Integer> m=new HashMap<>();
         Map<Character,Integer> m2=new HashMap<>();
        int l=s.length();
        int[] pref=new int[l];
        int[] suff=new int[l];
        int ans=0;
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(!m.containsKey(c))
            {
                m.put(c,1);
            }
            else
            {
               m.put(c,m.get(c)+1); 
            }
            pref[i]=m.size();
        }
        
         for(int i=l-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(!m2.containsKey(c))
            {
                m2.put(c,1);
            }
            else
            {
               m2.put(c,m2.get(c)+1); 
            }
            suff[i]=m2.size();
        }
      // System.out.println(Arrays.toString(pref));
     //    System.out.println(Arrays.toString(suff));
        for(int i=0;i<=l-2;i++)
        {
            if(pref[i]==suff[i+1])
            {
                ans++;
            }
        }
        return ans;
    }
}