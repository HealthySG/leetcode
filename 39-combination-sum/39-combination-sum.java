class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         ArrayList<Integer> a=new ArrayList<>();
         rec(candidates,target,a,0);
        return ans;
    }
    void rec(int[] candidates, int target,List<Integer> a,int curr){
    if(target==0)
    {
        List<Integer> temp=new ArrayList<Integer>(a);
       if(!ans.contains(temp))
           ans.add(temp);
       return;
    }
    for(int i=curr;i<candidates.length;i++)
    {
        if(candidates[i]<=target)
        {
             a.add(candidates[i]);
            rec(candidates,target-candidates[i],a,i);
            if((a.size()-1)!=-1)
                a.remove(a.size()-1);
        }
        /* if((a.size()-1)!=-1)
                a.remove(a.size()-1);*/
    }
    }
}