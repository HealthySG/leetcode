class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int diff1=0,diff2=0;
        int sum1=0,sum2=0;
        for(int i:nums1)
            sum1+=i;
        for(int i:nums2)
            sum2+=i;
        
        int con_max_sum_in_diff1=0,con_max_sum_in_diff2=0;
        for(int i=0;i<nums1.length;i++)
        {
            diff1+=nums2[i]-nums1[i];
            diff2+=nums1[i]-nums2[i];
            // Kadane's Algo
            con_max_sum_in_diff1=Math.max(con_max_sum_in_diff1,diff1);
            con_max_sum_in_diff2=Math.max(con_max_sum_in_diff2,diff2);
            
            if(diff1<0)
                diff1=0;
            if(diff2<0)
                diff2=0;
        }
        
        return Math.max(con_max_sum_in_diff1+sum1,con_max_sum_in_diff2+sum2);
    }
}