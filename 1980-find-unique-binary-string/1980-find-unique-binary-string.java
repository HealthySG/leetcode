class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int l=nums[0].length();
      //  System.out.println();
        // int len=Mat
        boolean[] a=new boolean[2<<l];
        for(int i=0;i<nums.length;i++)
        {
            int u=Integer.parseInt(nums[i],2);
            a[u]=true;
        }
        int idx=0;
        while(a[idx]!=false)
        {
            idx++;
        }
        String h=Integer.toBinaryString(idx);
        System.out.println(h);
        int h_len=h.length();
         if(h_len<l)
         {
           
             while(h_len!=l)
             {
                 h='0'+h;
                 h_len++;
             }
             return h;
         }
        else
            return h;
    }
}