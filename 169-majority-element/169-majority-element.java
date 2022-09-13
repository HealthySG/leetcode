class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return 1;
        Arrays.sort(nums);
        int ans=0,c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                c++;
                if((c+1)>nums.length/2)
                     ans=nums[i];
            }
            else
            {
                c=0;
            }
        }
        return ans;
    }
}