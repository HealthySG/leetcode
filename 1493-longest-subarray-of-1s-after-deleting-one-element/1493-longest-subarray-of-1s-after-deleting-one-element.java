class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int i=0,j=0,count=0,len=Integer.MIN_VALUE;
       for(i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            while(count>1)
            {
                if(nums[j]==0)
                {
                    count--;
                }
                j++;
            }
            len=Math.max(len, i-j+1);
        }
       /* len=Math.max(len,i-1);
        //count--;
        System.out.println(count);
        while(i<n)
        {
            
            if(nums[i]==0)
            {
                count++;
                i++;
            }
            len=Math.max(len,i-j-1);
            //j++;
            if(count==2)
            {
                j++;
            }
            i++;
        }
        
        System.out.println(i);
        */
        return len-1;
    }
}