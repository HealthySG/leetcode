class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length==1)
            return true;
        int count=0,s=0;
        boolean flag=true;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                if(i-2>=0 && nums[i]<nums[i-2])
                {
                   nums[i]=nums[i-1];
                }
                else
                {
                   nums[i-1]=nums[i];
                }
                count++;
               // System.out.println("S "+ s);
            }
            if(count>1)
            {
                flag=false;
                break;
            }  
        }
     //   System.out.println(count);
        if(flag==false)
            return false;
        return true;
    }
}