class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       Map<String,Integer> m=new HashMap<>();
        int ans=triangle.get(0).get(0);
        ans=rec(triangle,0,0,m);
        return ans;
    }
    int rec(List<List<Integer>> triangle,int row,int i, Map<String ,Integer> m)
    {
        if(row==triangle.size())
            return 0;
        String key=row+"J"+i; 
       if(m.containsKey(key))
           return m.get(key);
        int val=triangle.get(row).get(i);
      int op1=val+rec(triangle,row+1,i,m);
       int op2=val+rec(triangle,row+1,i+1,m);
       m.put(key,Math.min(op1,op2));
        return Math.min(op1,op2);
    }
}