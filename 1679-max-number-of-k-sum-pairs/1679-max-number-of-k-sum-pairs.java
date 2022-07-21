class Solution {
    public int maxOperations(int[] nums, int k) {
        if(nums.length==1)
            return 0;
        Arrays.sort(nums);
        int ans=0;
        int i=0,j=nums.length-1;
        while(i<j)
        {
            if(nums[i]+nums[j]==k)
            {
                ans+=1;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]<k)
            {
                i++;
            }
            else if(nums[i]+nums[j]>k)
            {
                j--;
            }
        }
        return ans;
    }
}