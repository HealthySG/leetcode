class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
         Map<Integer, Integer> valIndexMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            valIndexMap.put(nums[i],i);
        }
        for(int [] operation: operations){
            int index = valIndexMap.get(operation[0]);
            nums[index] = operation[1];
            valIndexMap.remove(operation[0]);
            valIndexMap.put(nums[index], index);
        }
        return nums;
    }
}