class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=candies.length;
        
        int high=Arrays.stream(candies).max().getAsInt();
       // long sum=Arrays.stream(candies).sum();
       // System.out.println(sum);
       // if(sum<k)
        //    return 0;
        int low=1,ans=0;
        while(low<=high)
        {
            int mid=(low+high)>>1;
             System.out.println(mid);
            if(isPossible(mid,candies,k))
            {
                ans=mid;
                low=mid+1;
                
            }
            
            else
            {
               // ans=high;
                high=mid-1;
            }
        }
        return ans;
    }
    boolean isPossible(int mid,int[] candies,long k)
    {
        long f=0;
        for(int i=0;i<candies.length;i++)
        {
                 f+=candies[i]/mid;
               
               
        }
        System.out.println(f);
        if(f>=k)
        {
           return true; 
        }
        else
        {
            return false;
        }
    }
}