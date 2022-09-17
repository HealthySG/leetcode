class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int mul=nums[i]*nums[j];
               mp.put(mul,mp.getOrDefault(mul,0)+1);
            }
        }
        int ANS=0;
        for(int key:mp.keySet())
        {
            int val=mp.get(key);
            if(val>1)
                ANS+=((val*(val-1))/2)*8;
        }
        return ANS;
    }
}