class Solution {
    public int smallestDivisor(int[] nums, int threshold)     {
        int len=nums.length,l=1,res=0;
        int h=Arrays.stream(nums).max().getAsInt();
        while(l<=h)
        {
          int   m=(l+(h))>>1;
         // System.out.println("Mid is " + m);
            if(ispossible(nums,m,len,threshold))
            {
               // res=m;
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return l;
    }
     boolean ispossible(int[] nums,int mid,int len,int threshold)
    {
        int sum=0;
        for(int j=0;j<len;j++)
        {
          //   System.out.println("Math.floor is " + nums[j]*1.0/mid*1.0);
            sum+=Math.ceil(nums[j]*1.0/mid*1.0);
            
        }
       //   System.out.println("Sum is " + sum);
        if(sum<=threshold)
        {
            return true;
        }
        return false;
     }
}