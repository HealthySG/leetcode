class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length,ans=Integer.MIN_VALUE;
        int i=0,j=0,and=0;
        while(i<n)
        {
            //if((and&nums[i])!=0)
            //{
                while((and&nums[i])!=0)
                {
                    and^=nums[j++]; // remove the bit of jth number sliding window
                }
                
           // }
            ans=Math.max(ans,i-j+1);
            and|=nums[i++]; // set the bit 
            
        }
        return ans;
    }
}