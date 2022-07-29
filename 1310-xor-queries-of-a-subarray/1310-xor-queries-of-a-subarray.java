class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int l=arr.length;
        int[] dp=new int[l];
        dp[0]=arr[0];
        for(int i=1;i<l;i++)
        {
            dp[i]=dp[i-1]^arr[i];
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int left=queries[i][0];
            int right=queries[i][1];
            if(left==0)
                ans[i]=dp[right];
            else
                ans[i]=dp[left-1]^dp[right];
        }
        return ans;
    }
}