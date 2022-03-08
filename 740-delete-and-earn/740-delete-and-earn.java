class Solution {
    public int deleteAndEarn(int[] nums) {
       /* Arrays.sort(nums);
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int[] dp=new int[hm.size()];
        int j=1,i=0;
        
        dp[0]=hm.get(nums[0])*nums[0];
        
        i+=hm.get(nums[0]);
        System.out.println(i);
        for(;i<nums.length;)
        {
            if(nums[i]-nums[i-1]<=1)
            {
                if(i-2>0)
                {
                     System.out.println(j);
               dp[j++]=Math.max((hm.get(nums[i])*nums[i]+dp[j-2]),dp[j-1]);
                i+=hm.get(nums[i]);
                    System.out.println(i);
                }
                else
                {
                    dp[j++]=Math.max((hm.get(nums[i])*nums[i]),dp[j-1]);
                     i+=hm.get(nums[i]);
                }
            }
            else
            {
                dp[j++]=dp[j-1];
                 i+=hm.get(nums[i]);
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[hm.size()-1];
        */
          TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int prevSum = 0;
		int currSum = 0;
		int prevKey = -1;

		for (int key : map.keySet()) {
			int m = Math.max(prevSum, currSum);
			if (key - 1 != prevKey) {
				currSum = key * map.get(key) + m;
				prevSum = m;
			} else {
				currSum = key * map.get(key) + prevSum;
				prevSum = m;
			}
			prevKey = key;
		}

		return Math.max(prevSum, currSum);
    
    }
}