class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0,m=nums1.length,n=nums2.length,c=0;
        int[] ans;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
               i++;
            else if(nums1[i]>nums2[j])
                j++;
            else
            {
                 nums1[k++]=nums1[i++];
                 j++;
                 c++;
            }
               
        }
        ans=Arrays.copyOfRange(nums1,0,c);
        return ans;
    }
}