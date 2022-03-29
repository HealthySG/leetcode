class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        /*int f=0,g=0,ind1=0,ind2=0;
        int l=text.length();
       int[] dp=new int[l];
       if(text.charAt(0)==pattern.charAt(0))
       {
           dp[0]=1;
           g++;
       }
       else
       {
           dp[0]=0;
       }
       for(int i=1;i<text.length();i++)
       {
           if(text.charAt(i)==pattern.charAt(0))
           {
               dp[i]=dp[i-1]+1;
               g++;
           }
           else if(text.charAt(i)==pattern.charAt(1) && f==0 && g!=0)
           {
               
              dp[i]=dp[i-1];
               f++;
           }
           else if(text.charAt(i)==pattern.charAt(1) && f!=0 && g!=0)
           {
               System.out.println(f);
              dp[i]=dp[i-1]+2;
               f++;
           }
           else
           {
               dp[i]=dp[i-1];
           }
       }
        System.out.println(Arrays.toString(dp));
        if(f>g)
        {
            return dp[l-1]+f;
        }
        else
        {
            return dp[l-1]+g;
        }
       /* for(int i=0;i<text.length();i++)
        {
            if(i<ind2 && ind1text.charAt(i)==pattern.charAt(0))
            {
                f++;
                ind1=i;
            }
            if(ind1>i && text.charAt(i)==pattern.charAt(1))
            {
                g++;
                ind2=i;
            }
        }
        */
      //  return 0;
        
                    long res = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < text.length(); ++i) {   
            if (text.charAt(i) == pattern.charAt(1)) {   
                res += cnt1; 
                cnt2++;
            }
            if (text.charAt(i) == pattern.charAt(0)) {   
                cnt1++;
            }
        }
        return res + Math.max(cnt1, cnt2);

    }
}