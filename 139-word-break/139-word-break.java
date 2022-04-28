class Solution {
    HashMap<String,Boolean> memo = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
       // int l=s.length();
        Set<String> dict=new HashSet<>(wordDict);
        return rec(s,dict);
    }
    boolean rec(String s, Set<String> dict)
    {
        if(memo.containsKey(s))
             return memo.get(s);
        int l=s.length();
        if(l==0)
            return true;
        for(int i=1;i<=l;i++)
        {
           // System.out.println("Running check first part "+s.substring(0,i));
           //  System.out.println("Running check second part "+s.substring(i));
            if(dict.contains(s.substring(0,i)) && rec(s.substring(i),dict))
            {
                memo.put(s,true);
                
                    return memo.get(s);
            }
        }
        memo.put(s,false);
         return memo.get(s);
    }
    
}