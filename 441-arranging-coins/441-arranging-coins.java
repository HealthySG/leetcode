class Solution {
    public int arrangeCoins(int n) {
      //  int sum=0,i=1,k=0;
        long low=1,high=n;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            long f=(mid*(mid+1))/2;
            if(f>n)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
       /* while(sum<=n)
        {
            sum+=i;
            i++;
            k++;
        }*/
        return (int)low-1;
    }
}