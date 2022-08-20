class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
         rec(nums,new ArrayList<>());
         return ans;  
    }
    void rec(int[] nums,List<Integer> l)
    {
        if(l.size()==nums.length)
            ans.add(new ArrayList<>(l));
        for(int i=0;i<nums.length;i++)
        {
            if(!l.contains(nums[i]))
            {
                 l.add(nums[i]);
            rec(nums,l);
            l.remove(l.size()-1);
            }
             else
             {
                 continue;
             }
        }
        
    }
}