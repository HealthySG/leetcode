class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        List<Integer>[] a=new List[n+1];
        Map<Integer,Integer> m=new HashMap<>();
        // int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
              m.put(nums[i],m.getOrDefault(nums[i],0)+1);
 	    }
        for(int key:m.keySet())
        {
            int f=m.get(key);
            if(a[f]==null)
            {
                a[f]=new ArrayList<>();
            }
            a[f].add(key);
        }
        System.out.println(Arrays.toString(a));
        int[] ans=new int[k];
        int h=0;
        for(int i=nums.length;i>=0;i--)
        {
           
           
            if(a[i]!=null)
            {
                
                 for(int j=0;j<a[i].size();j++)
                 {
                     ans[h++]=a[i].get(j);
                 }
            }
            if(h==k)
               break;
                
        }
        return ans;
    }
}