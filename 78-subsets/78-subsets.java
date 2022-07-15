class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
         backtrack(nums,new ArrayList<>(),0);
         return list;
    }
    private void backtrack(int [] nums,List<Integer> tempList, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(nums,tempList,i + 1);
        tempList.remove(tempList.size() - 1);
    }
}
}