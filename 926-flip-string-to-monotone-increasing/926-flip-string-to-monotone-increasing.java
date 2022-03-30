class Solution {
    public int minFlipsMonoIncr(String s) {
        int[] dp=new int[s.length()+1];
        int idx=1,bc=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                dp[i+1]=Math.min(dp[i]+1,bc);
            }
            else
            {
                dp[i+1]=dp[i];
                bc++;
            }
            //idx++;
        }
        return dp[s.length()];
    }
}