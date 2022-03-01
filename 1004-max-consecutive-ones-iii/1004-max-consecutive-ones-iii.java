class Solution {
    public int longestOnes(int[] nums, int k) {
       /* int n=nums.length;
        int l=0,r=0,ans=0;
        for(r=0;r<n;r++)
        {
            if(nums[r]==0)
            {
                if(k!=0)
                {
                    k--;
                }
                else
                {
                    if(nums[l]==0)
                    {
                        l++;
                    }
                    else
                    {
                        while(nums[l]!=0)
                        {
                            l++;
                        }
                      //  k++;
                    }
                   
                }
                 System.out.println("L is "+ l);
                 System.out.println("R is "+ r);
            }
            //System.out.println("R is "+ r);
            ans=Math.max(ans,r-l+1);
            
        }
        return ans;
        */
         int max = 0;
    int zeroCount = 0; // zero count in current window
    int i = 0; // slow pointer
    for(int j = 0; j < nums.length; ++j) {
        if(nums[j] == 0) { // move forward j, if current is 0, increase the zeroCount
            zeroCount++;
        }
        
        // when current window has more than K, the window is not valid any more
        // we need to loop the slow pointer until the current window is valid
        while(zeroCount > k) {  
            if(nums[i] == 0) {
                zeroCount--;
            }
            i++;
        }
        max = Math.max(max, j-i+1); // everytime we get here, the current window is valid 
    }
    return max;
    }
}