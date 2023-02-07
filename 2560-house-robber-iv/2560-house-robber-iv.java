class Solution {
   // int ans=Integer.MAX_VALUE;
    public int minCapability(int[] nums, int k) {
        // List<Integer> lt=new ArrayList<>();
        //  rec(nums,k,0,lt);
        // return ans;
        int l=1;int h=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(l<=h)
        {
            int mid=(l+h)>>1;
            if(isPossible(nums,mid,k))
            {
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
    }
    boolean isPossible(int[] nums, int mid,int k)
    {
        int laststeal=Integer.MIN_VALUE;
        int steal=0;
        for(int i=0;i<nums.length;i++)
        {
            if(laststeal==(i-1))
                continue;
            else if(nums[i]>mid)
            {
                continue;
            }
            steal++;
            laststeal=i;
            if(steal>=k)
                return true;
        }
        return false;
    }
//     void rec(int[] nums, int k,int idx,List<Integer> lt)
//     {
//         if(idx<nums.length || k==0)
//         {
//             lt.add(nums[idx]);
//             Collections.sort(lt);
//             System.out.println(lt);
//             ans=Math.min(ans,lt.get(lt.size()-1));
//             lt.remove(lt.size()-1);
//             return;
//         }
//         for(int i=idx;i<nums.length;i++)
//         {
//             lt.add(nums[i]);
//          //  if(i+2<nums.length)
//            {
//                rec(nums,k-1,i+2,lt);
//            }
//         }
       
//     }
}