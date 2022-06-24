class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=nums.length,p=1,c=0;
        if(k==0)
            return 0;
        for(int i=0,j=0;j<l;j++)
        {
           p*=nums[j];
           while(i<=j && p>=k) //T.C:-[1,1,1] k=1
               p/=nums[i++];
           c+=j-i+1; //every element will give us some number of subarrays 
        }
        return c;
    }
}