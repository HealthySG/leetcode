class Solution {
    public static int lengthOfLIS(int[] nums) {
        
   int n=nums.length;
   int[][] dp=new int[n][n];
    return recursion(nums,-1,0,n,dp);
   // int max_length=0;
    //int max_elem=0;
  /*  for(int i=0;i<n;i++)
    {
        int count=1;
        for(int j=i+1;j<n;j++)
        {
            if(nums[i]<nums[j] && max_elem<nums[j])
            {
                max_elem=nums[j];
                count++;
            }
            else
            {
            	max_elem=0;
            	break;
            }
        }
        max_length=Math.max(max_length,count);
    }
    return max_length;
    */
     /*   int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 1;
        for(int i=1; i < n; i++){
            for(int j=0; j <= i-1; j++){
                if(nums[i] > nums[j] && dp[i]<=dp[j])
                   dp[i]=1+dp[j];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
        */
        //return helper(-1,0,)
}
    static int recursion(int nums[],int prev,int curr,int n,int[][] dp)
    {
        if(curr==n)
            return 0;
         int op1=0;
        if(prev!=-1 && dp[prev][curr]!=0)
            return dp[prev][curr];
        if(prev==-1 || nums[prev]<nums[curr])
        {
          op1=1+recursion(nums,curr,curr+1,n,dp);
        }
        int op2=recursion(nums,prev,curr+1,n,dp);
        if(prev!=-1)
        {
          dp[prev][curr]=Math.max(op1,op2);
        }
        return Math.max(op1,op2);
    }
}