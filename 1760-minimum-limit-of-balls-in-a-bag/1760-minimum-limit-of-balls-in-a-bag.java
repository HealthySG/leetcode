class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max=Arrays.stream(nums).max().getAsInt();
        int low=1,high=max,ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            System.out.println("low "+ low +"mid " + mid + "high "+ high);
            if(check(mid,nums,maxOperations))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
              //  ans=low;
                low=mid+1;
            }
        }
        return ans;
    }
    boolean check(int mid,int[] nums,int maxOperations)
    {
        int fin=0;
        for(int i=0;i<nums.length;i++)
        {
          int op1=nums[i]/mid;
            if(nums[i]%mid==0)
                op1--;
            fin+=op1;
        }
        if(fin<=maxOperations)
            return true;
        else
            return false;
    }
}