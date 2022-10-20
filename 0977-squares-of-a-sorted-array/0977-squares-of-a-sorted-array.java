class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int i=0,j=n-1,k=n-1;
        while(i<=j)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
                 a[k]=nums[i]*nums[i];
                 i++;
                k--;
            }
            else if(Math.abs(nums[i])<Math.abs(nums[j]))
            {
                a[k]=nums[j]*nums[j];
                j--;
                 k--;
            }
            else if(i!=j && Math.abs(nums[i])==Math.abs(nums[j]))
            {
                a[k]=nums[j]*nums[j];
                 k--;
                 a[k]=nums[i]*nums[i];
                 k--;
                j--;
                i++;
            }
            else if(Math.abs(nums[i])==Math.abs(nums[j]))
            {
                a[k]=nums[i]*nums[i];
                 k--;
                i++;
            }
           // System.out.println(Arrays.toString(a));
        }
        return a;
    }
}