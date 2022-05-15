class Solution {
    public int largestCombination(int[] candidates) {
        int[] ones=new int[32];
  for (int candidate : candidates){
        int index = 0;
        while (candidate != 0){
            if((candidate & 1) == 1){
                ones[index] += 1;
            }
            candidate = candidate >> 1;
            index++;
        }
    }
    int maxAns = 0;
    for (int i = 0; i < ones.length; i++) {
        maxAns = Math.max(maxAns, ones[i]);
    }
    return maxAns;
    }
}