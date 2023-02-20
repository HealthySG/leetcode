class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length-1;
      int l=0,r=n;
        while(l<=r)
        {
            int mid=(l+r)>>1;
         //   System.out.println(mid);
            if(nums[mid]>target)
            {
                r=mid-1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                return mid;
            }
        }
      /*  if(l==0)
        {
            return l+1;
        }
        else if(l==n-1)
        {
            return l+2
        }*/
      //  return (l==0||l==n)?l+1:l;
         return l;
    }
}