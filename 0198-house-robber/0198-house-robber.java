class Solution {
    public int rob(int[] nums) {
           int l=nums.length;
        int[] dp=new int[l];
        if(l==1)
            return nums[0];
        else if(l==2)
            return Math.max(nums[0],nums[1]);
        else
        {
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
            for(int i=2;i<l;i++)
            {
                dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
            }
            return dp[l-1];
        }
    }
}