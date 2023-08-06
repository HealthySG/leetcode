class Solution {
    int n;
    public int minimumSeconds(List<Integer> nums) {
        n=nums.size();
      Map<Integer,List<Integer>> mp=new HashMap<>();
      for(int i=0;i<nums.size();i++)
      {
          Integer v=nums.get(i);
          mp.computeIfAbsent(v,k->new ArrayList<>()).add(i);
      }
        int min=Integer.MAX_VALUE;
     for(List<Integer> list:mp.values())
     {
           min = Math.min(getMaxGap(list), min);
     }
     // System.out.println(mp.toString());
        return min/2;
    }
     public int getMaxGap(List<Integer> positions){
        int max = 0;
        int prev = positions.get(positions.size()-1)-n; // first gap is between first position and last position
        for (int p : positions) {
            max = Math.max(p - prev, max);
            prev = p;
        }

        return max;
    }
}