class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=nums.length,p=1,c=0;
        if(k==0)
            return 0;
        for(int i=0,j=0;j<l;j++)
        {
           p*=nums[j];
           while(i<=j && p>=k)
               p/=nums[i++];
           c+=j-i+1;
        }
        return c;
    }
}