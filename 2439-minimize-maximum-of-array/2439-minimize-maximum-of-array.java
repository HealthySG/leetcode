// class Solution {
//     public int minimizeArrayValue(int[] nums) {
//         //int diff=0,ans=Integer.MIN_VALUE,max=Integer.MIN_VALUE;
//         int low=0,high=Arrays.stream(nums).max().getAsInt();
//        // int k=high;
//         int ans=0;
//         while(low<high)
//         {
//             int mid = (low + (high-low)/2);
//              System.out.println(mid);
//             if(ispossible(nums,mid))
//             {
//                // ans=mid;
               
//                 high=mid;
//             }
//             else
//             {
//                 low=mid+1;
//             }
//              System.out.println(ans +" "+ low + " "+ high);
//         }
//         return low;
//     }
//     boolean ispossible(int[] nums,int mid)
//     {
//         int[] a=nums.clone();
//         for(int j=0;j<a.length-1;j++)
//         {
//             if(a[j]>mid)
//                  return false;
//             a[j+1]-=(mid-a[j]);
//         }
//         return a[a.length-1]<=mid;
//     }
    
// }
class Solution {
    public int minimizeArrayValue(int[] nums) {
        int s = 0, e = max(nums), ans = e;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(check(nums, mid)) {
                ans = mid;
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return ans;
    }
    
    
    public boolean check(int[] nums, int mid) {
        if(nums[0] > mid) return false;
        long pre = nums[0];
        for(int i = 1; i < nums.length; i ++) {
            long scope = mid - pre;
            if(nums[i] - scope > mid) return false;
            pre = nums[i] - scope;
        }
        return true;
    }
    
    public int max(int[] arr) {
        int ans = 0;
        for(int i : arr) ans = i > ans ? i : ans;
        return ans;
    }
}