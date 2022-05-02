class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=-1;
        for(int j=0;j<nums.length;j++)
        {
            if((nums[j]&1)==0)
            {
                i++;
                
                swap(i,j,nums);
                //System.out.println("i" + i);
                //System.out.println("j" + j);
                
               // i++;
            }
           /* else
            {
                j++;
            }
            */
        }
        return nums;
    }
    void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}