class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          Set<List<Integer>> l  = new HashSet<>();
        if(nums==null || nums.length<3)
            return new ArrayList<>(l);
        int target=0,sum=0;
          Arrays.sort(nums);
         int result = nums[0] + nums[1] + nums[nums.length - 1];
      //  Arrays.sort(num);
        for (int i = 0; i < nums.length-2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];
                 if (sum==0) {
                    List<Integer> l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[start]);
                    l1.add( nums[end]);
                     if(!l.contains(l1))
                       l.add(l1);
                    end--;
                }
               else if (sum > target) {
                    end--;
                } else {
                    start++;
                }
               
            }
        }
        
        return new ArrayList<>(l);
    }
}