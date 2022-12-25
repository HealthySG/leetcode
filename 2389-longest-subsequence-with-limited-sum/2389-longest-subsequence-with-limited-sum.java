class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        long[] dp=new long[nums.length];
        int[] ans=new int[queries.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
          //  int target=queries[i];
            dp[i]=dp[i-1]+nums[i];
          //  int j=0,k=nums.length-1;
            
        }
        int k=0;
        for(int i=0;i<queries.length;i++)
        {
            int target=queries[i];
            int temp=-1,j=0;
            while(j<dp.length && dp[j]<=target)
            { 
                temp=j;
                j++;           
            }
                if(temp==dp.length-1)
                {
                    ans[i]=dp.length;
                }
                else if(temp==-1)
                {
                    ans[i]=temp+1;
                }
                else
                {
                   ans[i]=temp+1;
                }
            }
         return ans;
        /*for(int i=0;i<queries.length;i++)
        {
            int target=queries[i];
            int j=0,k=nums.length-1;
            while(j<=k)
            {
                int mid=(j+k)>>1;
                if(nums[mid]<=target)
                {
                 //   int temp=mid+1;
                    ans[i]=Math.max(ans[i],mid);
                     j=mid+1;
                     
                  //  break;
                }
                /*else if(nums[mid]<target)
                {
                   
                }
                else
                {
                   k=mid-1; 
                }
            }
        }*/
       
    }
}