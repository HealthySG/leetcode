class Solution {
    Set<List<Integer>> ans=new HashSet<>();
    int n;
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> ans1=new ArrayList<>();
        n=nums.length;
        rec(nums,0,ans1);
        return new ArrayList<>(ans);
    }
    void rec(int[] nums,int i,List<Integer> ans1)
    {
        if(ans1.size()>1)
        {
            List<Integer> lt=new ArrayList<>(ans1);
                ans.add(lt);
        }
        for(int j=i;j<n;j++)
        {
            if(ans1.isEmpty() || ans1.get(ans1.size()-1)<=nums[j])
            {
                 ans1.add(nums[j]);
                  rec(nums,j+1,ans1);
               // if(ans1.size()>0)
            ans1.remove(ans1.size()-1);
            }
            
        }
    }
}