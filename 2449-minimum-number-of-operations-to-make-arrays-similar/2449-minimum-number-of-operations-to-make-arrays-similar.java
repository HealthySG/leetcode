class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        List<Integer> l1_even=new ArrayList<>();
        List<Integer> l1_odd=new ArrayList<>();
        List<Integer> l2_even=new ArrayList<>();
        List<Integer> l2_odd=new ArrayList<>();
        for(int num:nums)
        {
            if(num%2==0)
                l1_even.add(num);
            else
                l1_odd.add(num);
        }
        for(int tar:target)
        {
            if(tar%2==0)
                l2_even.add(tar);
            else
                l2_odd.add(tar);
        }
        Collections.sort(l1_even);
        Collections.sort(l2_even);
        Collections.sort(l1_odd);
        Collections.sort(l2_odd);
        
        long ans=0L;
        for(int i=0;i<l1_even.size();i++)
        {
            ans+=Math.abs(l1_even.get(i)-l2_even.get(i))/2;
        }
         for(int i=0;i<l2_odd.size();i++)
        {
            ans+=Math.abs(l2_odd.get(i)-l1_odd.get(i))/2;
        }
        return ans/2;
    }
}