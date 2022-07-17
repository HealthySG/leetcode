class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int ans=-1,wgcd=numsDivide[0];
        boolean flag=false;
        for(int i=1;i<numsDivide.length;i++)
        {
            wgcd=gcd(numsDivide[i],wgcd);   
        }
        
      //  System.out.println("wgcd "+wgcd);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(wgcd%nums[i]==0)
            {
               // return ans;
                 ans=i;
                 break;
            }
          //  ans++;   
            
        }
     //   System.out.println("ans "+ans);
       if(ans!=-1)
            return ans;
        else
            return -1;
    }
     int gcd(int a,int b)
	{
	    if(a%b==0)
	    {
	        return b;
	    }
	    else 
	    {
	        return gcd(b,a%b);
	    }
	}
}