class Solution {
    public int singleNonDuplicate(int[] nums) {
       int lo=0 , hi=nums.length-1;
     
     int n=nums.length;
     
     //boundary cases 
     if(n==1) return nums[0];
     else if(nums[0]!=nums[1]) return nums[0];
     else if(nums[n-1]!=nums[n-2]) return nums[n-1];
     
     
     while(lo<=hi){
         int mid = lo + (hi-lo)/2;
       //  System.out.println(lo + " "  + mid + " "  + hi); 
         if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
         
         if(nums[mid]==nums[mid-1]){
             //lc(left count) : lo to mid count
             int lc = mid - lo + 1;
             
             if(lc%2==0) lo=mid+1;
             else hi=mid-2;
         }else if(nums[mid]==nums[mid+1]){
             //right count (rc) : mid to right count
             int rc = hi - mid + 1;
             
             if(rc%2==0) hi=mid-1;
             else lo=mid+2;
         }
     }
     
     return -1;
    }
}