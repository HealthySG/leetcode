class Solution {
    public int numPairsDivisibleBy60(int[] time) {
       // int[] a=new int[60];
        int mod=0;
       Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<time.length;i++)
        {
            mod=time[i]%60;
            mp.put(mod,mp.getOrDefault(mod,0)+1);
         //   a[mod]++;
           // if(mp.containsKey(mod))
        }
        System.out.println(mp);
        long ans=0,j=0,ans1=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            if(entry.getKey()==0 || entry.getKey()==30)
            {
                j=entry.getValue();
                ans+=j*(j-1)/2;
            }
            else if(mp.containsKey(60-entry.getKey()))
               {
                   int g=mp.get(60-entry.getKey());
                   ans1+=g*(entry.getValue());
                   
               }
               
        }
        System.out.println(ans1);
        return (int)(ans1/2+ans);
    }
}