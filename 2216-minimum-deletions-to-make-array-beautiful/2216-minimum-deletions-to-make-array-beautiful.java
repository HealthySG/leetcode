class Solution {
    public int minDeletion(int[] nums) {
        int ans=0;
        int l=nums.length;
       // Arrays.sort(nums);
      //  int[] a=new int[100000];
       /* for(int i=0;i<l;i++)
        {
            a[nums[i]]++;
        }
        System.out.print(Arrays.toString(a));
        */
        for(int i=0;i<nums.length-1;i++)
        {
            /*if(a[nums[i]]!=1)
            {
            */
                /*if(((i-ans)&1)==0 && a[nums[i]]>2)
                {
                    ans=ans+a[nums[i]]/2;
                    i+=a[nums[i]];
                }
                else if(((i-ans)&1)==1 && a[nums[i]]<=2)
                {
                     i+=a[nums[i]];
                }
                */
                if(nums[i]==nums[i+1] && ((i-ans)&1)==0)
                {
                    ans++;
                  //  i+=a[nums[i]];
                }
            }
           System.out.println(ans);
         if(((l-ans)&1)==0)
            return ans;
         else 
            return ans+1;
        }
       
}