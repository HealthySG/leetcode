class Solution {
    public int numDecodings(String s) {
        Integer[] memo = new Integer[s.length() + 1];
        return rec(0,s,memo);
    }
    int rec(int idx,String s,Integer[] memo)
    {
        if(s.length()==idx)
            return 1;
        if(s.charAt(idx)=='0')
            return 0;
       if (memo[idx] != null) {
		return memo[idx];
	}
        int ways1=rec(idx+1,s,memo);
        int ways2=0;
        if(idx<s.length()-1 && Integer.parseInt(s.substring(idx,idx+2))<=26)
        {
            ways2=rec(idx+2,s,memo);
        }
      memo[idx] = ways1 + ways2;
	  return memo[idx];
    }
}