class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       
        /*if(nums.length==1)
            return false;
         if(k==1)
            return true;
        if(nums.length==2)
        {
            if((nums[0]+nums[1])%k!=0)
             return false;
            else
                return true;
        }
        //if()
        else
        {
             int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pref[i]=pref[i-1]+nums[i];
        }
        for(int j=0;j<=nums.length-2;j++)
        {
            if(j!=0)
            {
                if(pref[j]%k==0)
                    return true;
            }
            for(int i=2;i<nums.length;i++)
           {
              if(j+i<nums.length && (pref[j+i]-pref[j])%k==0)
                  return true;
           }
        }
            if(pref[nums.length-1]%k==0)
                return true;
            if(pref[nums.length-2]%k==0)
                return true;
       return false;
        }
       */
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k; 
            // case 1
            if (sum == 0 && i > 0) {
                return true;
            }
            // case 2
            if (map.containsKey(sum) && i - map.get(sum) > 1) { 
                return true;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i); 
            }
            
        }
        return false;
    }
}