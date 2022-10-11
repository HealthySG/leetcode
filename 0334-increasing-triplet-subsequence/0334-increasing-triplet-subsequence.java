class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE,k=0;
        int c=0;
        while(k<nums.length)
        {
            if(nums[k]<=first)
            {
                first=nums[k];
                k++;
                // if(i==0)
                // {
                //    k=i;
                //     i++;  
                // }
                // else if(nums[i]<nums[j] && nums[k]<nums[i])
                //     return true;
                // else if(i!=0 && nums[i]<nums[j])
                //     i++;    
            }
            else if(nums[k]<=second)
            {
                second=nums[k];
                k++;
            }
            else
             return true;
        }
        return false;
    }
}