class Solution {
    //int count=0;
    Map<Integer,Integer> m=new HashMap<>();
    public int climbStairs(int n) {
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        if(m.containsKey(n))
            return m.get(n);
        int g=climbStairs(n-1)+climbStairs(n-2);
         m.put(n,g);
         return g;
    }
}