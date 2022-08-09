class Solution {
    public int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1;
      /*  if(nums.length==1)
            return 0;
        if(nums.length==2)
            return nums[0]>nums[1]?0:1;
        while(low<=high)
        {
            int mid=(low+high)>>1;
            if(mid==0 || mid==nums.length-1)
                return mid==0?0:nums.length-1;
          //  System.out.println(mid);
            if(mid-1>0 && mid+1<nums.length && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;
            else if(mid-1>0 && nums[mid-1]>nums[mid])
                high=mid-1;
            else if(mid+1<nums.length &&  nums[mid+1]>nums[mid])
                low=mid+1;
        }
        return 0;*/
        while(low<high)
        {
            int mid=(low+high)>>1;
            if(nums[mid]>nums[mid+1])
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}