class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        // if(k==1)
        // {
        //     for(int i=0;i<n;i++)
        //     {
        //         if(Math.abs(nums1[i]-nums2[i])>1)
        //             return -1;
        //     }
        //     return 1;
        // }
        if(k==0)
        {
            for(int i=0;i<n;i++)
            {
                if(nums1[i]!=nums2[i])
                    return -1;
            }
            return 0;
        }
    int[] diff = new int[n];
    for (int i = 0; i < n; i++) {
        diff[i] = nums1[i] - nums2[i];
    }
    long res = 0;
        long sum=0;
    for (int i = 0; i < n; i++) {
        if (Math.abs(diff[i]) % k != 0) {
            return -1;
        }
        res+=Math.abs(diff[i])/k;
        sum+=diff[i];
    }
   if(sum==0)
       return res/2;
    else
    {
        return -1;
    }
    }
}