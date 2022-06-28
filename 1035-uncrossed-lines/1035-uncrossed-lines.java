/*class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length][nums2.length];
        return rec(nums1,nums2,0,0,dp);
    }
    int rec(int[] nums1, int[] nums2,int i,int j,int[][] dp)
    {
        if(nums1.length==i || nums2.length==j)
            return 0;
        int count=0;
        if(dp[i][j]!=0)
            return dp[i][j];
        if(nums1[i]==nums2[j])
        {
            count+=1+rec(nums1,nums2,i+1,j+1,dp);
            dp[i][j]=count;
        }
        else
        {
            count+=Math.max(rec(nums1,nums2,i+1,j,dp),rec(nums1,nums2,i,j+1,dp));
            dp[i][j]=count;
        }
        return dp[i][j];
    }
}
*/
class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int dp[][]=new int [A.length+1][B.length+1];
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(A[i-1]==B[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}