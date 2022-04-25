class Solution {
    public int maxProduct(int[] nums) {
      /*  if(nums.length==1)
            return nums[0];
        int curr=nums[0];
        int n=0,p=0;
        int[] out=new int[nums.length];
        
        Arrays.fill(out,1);
        out[0]=curr;
        if(curr==0)
            curr=1;
       if(out[0]<0)
            n++;
        else
             p++;
        for(int i=1;i<nums.length;i++)
        {
         
          curr*=nums[i];
           
         out[i]=curr;
            if(curr==0)
              curr=1;
         if(out[i]<0)
            n++;
         else
             p++;
        }
        Arrays.sort(out);
        if(out[nums.length-1]==0)
            return 0;
        if(Math.abs(out[0])>out[nums.length-1] && (n&1)==1)
        {
            return Math.abs(out[0]);
        }
         //System.out.println(Arrays.toString(out));
        return out[nums.length-1];
        */
        int max_ending = nums[0], min_ending = nums[0];
         int max_so_far = nums[0];
       for(int i=1;i<nums.length;i++)
        {
           int temp = max_ending;
 
            // update the maximum product ending at the current index
            max_ending = Integer.max(nums[i], Integer.max(nums[i] * max_ending,
                                                nums[i] * min_ending));
           // System.out.println("max_ending" + max_ending);
            // update the minimum product ending at the current index
            min_ending = Integer.min(nums[i], Integer.min(nums[i] * temp,
                                                nums[i] * min_ending));
          // System.out.println("min_ending" + min_ending);
            max_so_far = Integer.max(max_so_far, max_ending);
        }
        return max_so_far;
    }
}