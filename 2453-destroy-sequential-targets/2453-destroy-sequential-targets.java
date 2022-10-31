class Solution {
    public int destroyTargets(int[] nums, int space) {
      int res = (int)1e9;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int a : nums)
            count.put(a % space, count.getOrDefault(a % space, 0) + 1);
        int maxc = Collections.max(count.values());
        for (int a : nums)
            if (count.get(a % space) == maxc)
                res = Math.min(res, a);
        return res;
        
    }
}