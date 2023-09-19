class Solution {
    public int findDuplicate(int[] nums) {
        int low=1,high=nums.length;
        int len=nums.length;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            int cnt=0;
            for(int i=0;i<len;i++)
            {
                if(mid>=nums[i])
                    cnt++;
            }
            if(mid<cnt)
            {
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
}