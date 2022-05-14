class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        Arrays.fill(res,-1);
        res[0]=Math.max(res[0],findFirst(nums,target));
        //if(res[0]>0)
        res[1]=Math.max(res[1],findlast(nums,target));
        return res;
    }
    int findFirst(int[] nums, int target)
    {
        int s=0,l=nums.length-1,m=0,f=-2;
        while(s<=l)
        {
            m=(s+l)/2;
            if(nums[m]>=target)
            {
                 l=m-1;
               
            }
            else
            {
                s=m+1;
            }
            if(nums[m]==target)
                f=m;
        }
        return f;
    }
    int findlast(int[] nums, int target)
    {
         int s=0,l=nums.length-1,m=0,lm=-2;
        while(s<=l)
        {
            m=(s+l)/2;
            if(nums[m]<=target)
            {
                s=m+1;
            }
            else
            {
                l=m-1;
            }
            if(nums[m]==target)
                lm=m;
        }
        return lm;
    }
}