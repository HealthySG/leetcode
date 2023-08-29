class Solution {
    public int bestClosingTime(String customers) {
        String customers1=customers+'N';
       // int l=customers1.length()-1;
        int[] pref=new int[customers1.length()];
        int[] suff=new int[customers1.length()];
        pref[0]=customers1.charAt(0)=='N'?1:0;
        suff[customers1.length()-1]=customers1.charAt(customers1.length()-1)=='Y'?1:0;
        
        for(int i=1;i<customers1.length();i++)
        {
            if(customers1.charAt(i)=='N')
            pref[i]=pref[i-1]+1;
            else
            {
                pref[i]=pref[i-1];
            }
            
        }
        for(int i=customers1.length()-2;i>=0;i--)
        {
            if(customers1.charAt(i)=='Y')
            suff[i]=suff[i+1]+1;
            else
            {
                suff[i]=suff[i+1];
            }
            
        }
        // boolean f=false;
        // if(suff[0]==l+1)
        //     f=true;
        // System.out.println(Arrays.toString(pref));
        // System.out.println(Arrays.toString(suff));
        int min=Integer.MAX_VALUE;
        int min_ind=Integer.MAX_VALUE;
        for(int i=0;i<customers1.length();i++)
         {
            if(customers1.charAt(i)=='Y')
            {
                if(suff[i]+pref[i]<min)
                {
                    min=suff[i]+pref[i];
                    min_ind=i;
                }
        
            }
            else
            {
                if(suff[i]+pref[i]-1<min)
                {
                    min=suff[i]+pref[i]-1;
                    min_ind=i;
                }
            }
         }
        return min_ind;
    }
}