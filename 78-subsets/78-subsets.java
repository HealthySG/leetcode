class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
         rec(nums,new ArrayList<>(),0);
        return ans;
    }
    void rec(int[] nums,List<Integer> l,int ind)
    {
       // if(ans)
        ans.add(new ArrayList<>(l));
        for(int i=ind;i<nums.length;i++)
        {
            l.add(nums[i]);
            rec(nums,l,i+1);
            l.remove(l.size()-1);
        }
    }
}