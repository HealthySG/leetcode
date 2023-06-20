import java.math.BigInteger;
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int output[]=new int[nums.length];
        boolean windowSumCalculated=false;
        BigInteger windowSum=BigInteger.valueOf(0);
        for(int i=0;i<nums.length;i++)
        {
            if(i-k<0 || i+k>nums.length-1)
            {
                output[i]=-1;
            }
            else if(i-k>=0 && i+k<=nums.length-1)
            {
                int start=i-k;
                int end=i+k;
                
                BigInteger div=BigInteger.valueOf(2*k+1);
                
                if(!windowSumCalculated)
                {
                    windowSum=calculateSum(start,end,nums);
                    output[i]=windowSum.divide((div)).intValue();
                    windowSumCalculated=true;
                }
                else
                {
                    windowSum=windowSum.subtract(BigInteger.valueOf(nums[i-k-1])).add( BigInteger.valueOf(nums[i+k]));
                    output[i]=windowSum.divide(div).intValue();
                }
            }
        }
        return output;
    }
    
    private BigInteger calculateSum(int start,int end,int nums[])
    {
        int j=start;
        BigInteger sum=BigInteger.valueOf(0);
        while(j<=end)
        {
            sum=sum.add(BigInteger.valueOf(nums[j]));
            j++;
        }
        return sum;
    }
    
    
}


