class Solution {
    public long maxArrayValue(int[] nums) {
        int n=nums.length;
        long suffsum=0;
        // int[] suff=new int[n];
        // pref[0]=nums[0];
        // int start=-1;
         long ans=Long.MIN_VALUE;
        // for(int i=1;i<n;i++)
        // {
        //     if(nums[i-1]<=nums[i])
        //     {
        //         if(start==-1)
        //         {
        //             start=i-1;
        //         }
        //         pref[i]=nums[i]+pref[i-1];
        //     } 
        //     else{
        //         if(start!=0)
        //            ans=Math.max(ans,pref[i-1]+pref[start]);
        //         else{
        //              ans=Math.max(ans,pref[i-1]);
        //         }
        //         pref[i]=nums[i];
        //         start=-1;
        //     }
        // }
        // return ans;
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]>suffsum)
                suffsum=0;

            suffsum+=nums[i];
            ans=Math.max(ans,suffsum);
        }
        return ans;
    }
}