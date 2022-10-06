class Solution {
    public long minimumReplacement(int[] nums) {
        int n=nums.length;
        long ans=0;
       int  next=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]>next)
            {
                //diff=nums[i-1]-nums[i];
                int op=nums[i]/next;
                if(nums[i]%next!=0)
                    op++;
                ans+=(op)-1;
                next=nums[i]/op;
            }
            else
            {
                next=nums[i];
            }
        }
        return ans;
    }
}