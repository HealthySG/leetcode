class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
    Set<Integer> set = new HashSet<>();
    long sum = 0;
    
    for (int num: nums) {
        if (!set.contains(num) && num <= k) {
            k++;
            sum += num;        
        }            
        set.add(num);
    }
    
    long res = (long)(1 + k) * k / 2 - sum;
    return res;   
       /* for(int i=0;i<nums.length-1;i++)
        {
            if((nums[i+1]-nums[i])!=1)
            {
                int g=nums[i+1]-nums[i]
                for(int j=i;j<)
            }
        }*/
       /* int sum=0;
        int i=0;
        int nextVal=nums[i];
        int curVal=1;
        int counter=0;
        while(curVal != nextVal && counter<k)
        {
            sum=sum+curVal;
            curVal++;
            if(curVal==nextVal)
            {
                i++;
                if(i<nums.length)
                    curVal=nums[i];
            }
        }
        */
    /*    int sum=0,ans=0;
        for(int i=0;i-1>0 && i<n && k!=0;i++)
        {
            sum=sum+nums[i];
            if(sum!=nums[i]*(nums[i]+1)/2)
            {
                k-=nums[i]-(i+1);
                ans+=nums[i]*(nums[i]+1)/2-sum;
            }
                
        }
        int rem=nums[n-1];
        while(k!=0)
        {
            ans+=rem+1;
            rem++;
            k--;
        }
        */
       // return ans;
    }
}