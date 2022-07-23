class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                int j=i+1;
                while(j<nums.length && nums[j]==0)
                    j++;
                if(j<nums.length)
                 swap(nums,i,j);
            }
        }
    }
    void swap(int a[],int i,int j)
    {
        a[i]=a[i]^a[j];
        a[j]=a[i]^a[j];
        a[i]=a[i]^a[j];
    }
}