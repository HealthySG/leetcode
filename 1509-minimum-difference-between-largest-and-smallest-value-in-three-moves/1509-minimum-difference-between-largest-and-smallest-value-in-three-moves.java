class Solution {
    public int minDifference(int[] nums) {
        int l=nums.length,ans=Integer.MAX_VALUE;
         if(l<=3)
            return 0;
        Arrays.sort(nums);
        for(int i=0;i<=3;i++)
        {
            ans=Math.min(ans,nums[l-4+i]-nums[i]);
        }
        /*
        for(int i=0;i<l-2;i++)
        {
            ans=Math.min(ans,nums[i+2]-nums[i]);
        }
       */
        
            return ans;
    }
}