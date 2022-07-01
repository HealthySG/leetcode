class Solution {
 //   int ans=Integer.MIN_VALUE;
      Map<Integer, Integer> map = new HashMap<>();
    public int integerBreak(int n) {
           if (map.containsKey(n)) return map.get(n);
        if(n==1)
            return 1;
       // System.out.println(n);
         int subans=0;
        for(int i=1;i<=n/2;i++)
        {
           
            subans=Math.max(subans,i*Math.max(integerBreak(n-i),(n-i)));
           // System.out.println("subans is"+ subans);
          //  ans=Math.max(ans,subans);
           
        }
           map.put(n, subans);
        return map.get(n);
        // return subans;
    }
}