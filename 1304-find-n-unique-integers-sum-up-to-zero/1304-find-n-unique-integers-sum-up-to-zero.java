class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int j=0;
        if(n%2==0)
        {
            for(int i=n/2;i>0;i--)
            {
                ans[j]=-i;
                ans[j+1]=i;
                j+=2;
            }
        }
        else
        {
             for(int i=n/2;i>0;i--)
            {
                ans[j++]=-i;
                //ans[j+1]=i;
               // j+=2;
            }
            ans[j]=0;
            for(int i=1;i<=n/2;i++)
            {
                ans[j++]=i;
                //ans[j+1]=i;
               // j+=2;
            }
        }
        return ans;
    }
}