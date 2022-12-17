class Solution {
    Integer arr[]={2,3,5,7};
    int n;
    int l;
     Integer[][] dp;
    int mod=1000_000_007;
    Set<Integer> set = new HashSet<>(Arrays.asList(arr));
    public int beautifulPartitions(String s, int k, int minLength) {
        n=s.length();
        l=minLength;
       dp=new Integer[n][k+1];
        return rec(s,k,0);
    }
    int rec(String s,int k,int i)
    {
        //rec(s,k,i+(k-1));
        //if(k!=prev_part)
        if(i==n && k==0)
            return 1;
        if(i==n && k!=0)
            return 0;
        if(k==0)
             return 0;
        if(dp[i][k]!=null)
            return dp[i][k];
        if(!set.contains(s.charAt(i)-'0'))
            return 0;
        int ans=0;
              for(int j=i+l-1;j<n-(k-1)*l;j++)
                {
                    if(j>=0 && !set.contains(s.charAt(j)-'0'))
                    {
                        ans=(ans+rec(s,k-1,j+1)%mod)%1000_000_007;
                    }
                    else
                    {
                        continue;
                    }
                }
         dp[i][k]=ans;
        return ans;
        
    }
}