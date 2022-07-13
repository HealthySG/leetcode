class Solution {
    public int search(int[] nums, int target) {
      int start = 0, end = nums.length - 1;  
      while(start<end)
      {
          int mid = (start + end)>>1;
          if(nums[mid]>nums[end])
              start=mid+1;
          else
              end=mid;
      }
       // System.out.println("start is " + start);
      int ans1=bs(nums,0,start-1,target);
      //   System.out.println("ans is " + ans1);
      int ans2=bs(nums,start,nums.length - 1,target);
     //    System.out.println("ans2 is " + ans2);
      return Math.max(ans1,ans2);  
     
    }
    int bs(int[] nums,int sl,int el,int target)
    {
      //  System.out.println("sl is " + sl);
        //   System.out.println("el is " + el);
       while(sl<=el)
      {
         //  System.out.println("sl is " + sl);
          // System.out.println("el is " + el);
          int mid = (sl + el)>>1;
         //   System.out.println("MID is " + mid);
          if(nums[mid]==target)
              return mid;
          else if(nums[mid]<target)
          {
                 sl=mid+1;
              //   System.out.println("SL2 is " + sl);
          }
          else
          {
                 el=mid-1;
          }
           
      }
      return -1;
    }
}