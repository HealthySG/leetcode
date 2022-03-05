class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n)
            return -1;
        int l=Arrays.stream(bloomDay).min().getAsInt();
        int h=Arrays.stream(bloomDay).max().getAsInt();
        return help(l,h,bloomDay,m,k,n);
    }
    int help(int l,int h,int[] bloomDay, int m, int k,int n)
    {
        while(l<=h)
        {
            int mid=(l+(h))>>1;
            System.out.println(mid);
            if(ispossible(mid,m,k,bloomDay,n))
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
    boolean ispossible(int mid,int m,int k,int[] bloomDay,int n)
    {
        int count=0,v=0;
        for(int i=0;i<n;i++)
        {
            if(bloomDay[i]<=mid)
            {
               
                v++;
            }
            else
            {
               v=0;
            }
            if(v==k)
            {
                count++;
                v=0;
            }
        }
        if(count>=m )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}