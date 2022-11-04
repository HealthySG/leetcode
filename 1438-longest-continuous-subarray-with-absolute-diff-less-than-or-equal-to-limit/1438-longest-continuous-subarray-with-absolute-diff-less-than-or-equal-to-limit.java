class Solution {
    public int longestSubarray(int[] nums, int limit) {
    int i = 0, j;
    TreeMap<Integer, Integer> m = new TreeMap<>();
    for (j = 0; j < nums.length; j++) {
        m.put(nums[j], 1 + m.getOrDefault(nums[j], 0));
        if (m.lastEntry().getKey() - m.firstEntry().getKey() > limit) {
            m.put(nums[i], m.get(nums[i]) - 1);
            if (m.get(nums[i]) == 0)
                m.remove(nums[i]);
            i++;
        }
    }
    return j - i;
    }
}