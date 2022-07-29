class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length,ans=0;
        if(n<3)
            return 0;
        int prev_diff=nums[1]-nums[0];
         int c=0;
        for(int i=1;i<n-1;i++)
        {
           
            int diff=(nums[i+1]-nums[i]);
            if(diff==prev_diff)
                c++;
            else
            {
                prev_diff=diff;
                c=0;
            }
            ans+=c;    
              
           /* for(int j=i+1;j<n;j++)
            {
                if(Math.abs(nums[j]-nums[j-1])==diff)
                {
                     c++;
                }
              /*  else if(Math.abs(nums[j]-nums[i])==0)
                {
                    if(Math.abs(nums[j-1]-nums[i])==0)
                        c++;
                }
                else
                    break;
                //System.out.println(c);
                if(c>=3)
                    ans++;*/
             
        }
        return ans;
    }
}