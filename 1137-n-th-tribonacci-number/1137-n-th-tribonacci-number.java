class Solution {
    Map<Integer,Integer> m=new HashMap<>();
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
         if(n==2)
            return 1;
        if(m.containsKey(n))
            return m.get(n);
        int g=tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
        m.put(n,g);
        return g;
    }
}