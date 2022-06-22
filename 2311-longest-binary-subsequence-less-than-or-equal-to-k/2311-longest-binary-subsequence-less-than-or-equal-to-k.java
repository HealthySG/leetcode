class Solution {
    public int longestSubsequence(String s, int k) {
        if(s.length()==1)
        {
            if((s.charAt(0)-'0')<=k)
                return 1;
        }
        int l=s.length()-1;
        int i=l,j=0,sum=0,ans=0;
        while(i>=0 && sum<=k)
        {
          //  if(s.charAt(i)=='0')
            //    p++;
            sum+=(s.charAt(i)-'0')*Math.pow(2,j);
          //  System.out.println(sum);
            i--;
            j++;
        }
        if(i==-1)
         return l+1;
        ans+=l-(i+1);
        for(int o=0;o<=i;o++)
        {
            if(s.charAt(o)=='0')
               ans++;
        }
        return ans;
    }
}