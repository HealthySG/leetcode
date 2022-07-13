class Solution {
    public int findMin(int[] nums) {
       /* int l=nums.length;
        if(l==1)
        {
            return nums[0];
        }
        
        int i=0,j=nums.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            System.out.println(mid);
            if(mid+1<n && mid-1>0 && nums[mid]<nums[mid+1] && nums[mid]<nums[mid-1])
            {
                return nums[mid];
            }
            else if(mid==0 && nums[mid]>nums[j])
            {
                i=mid+1;
            }
            
            else if(nums[mid]<=nums[i] && nums[mid]<nums[j])
            {
                j=mid-1;
            }
           
            else if(nums[mid]>=nums[i] && nums[mid]>nums[j])
            {
                i=mid+1;
            }
            
            else if(nums[mid]>=nums[i] && nums[mid]<nums[j])
            {
               j=mid-1;
            }
        }
        */
        if (nums== null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
     /*   int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[start] <= nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
        */
     //   return 0;
      int start = 0, end = nums.length - 1;  
      while(start<end)
      {
          int mid = (start + end)>>1;
          if(nums[mid]>nums[end])
              start=mid+1;
          else
              end=mid;
      }
          return nums[start];
    }
}