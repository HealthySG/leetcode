class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int l=matrix.length;
        int l1=matrix[0].length;
        int[][] dp=new int[l][l];
        if(l==1)
        {
            return matrix[0][0];
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l1;j++)
            {
                
                 if(i==0)
                {
                    dp[i][j]=matrix[i][j];
                    
                }
                else
                {
                    if(j==0)
                    {
                        
                        dp[i][j]=Math.min((matrix[i][j]+dp[i-1][j]),(matrix[i][j]+dp[i-1][j+1]));
                        if(i==l-1)
                        {
                            mini=Math.min(dp[i][j],mini);
                        }
                    }
                    else if(j==l-1)
                    {
                        dp[i][j]=Math.min((matrix[i][j]+dp[i-1][j]),(matrix[i][j]+dp[i-1][j-1]));
                        if(i==l-1)
                        {
                            mini=Math.min(dp[i][j],mini);
                        }
                        
                    }
                    else
                    {
                        int c=Math.min((matrix[i][j]+dp[i-1][j]),(matrix[i][j]+dp[i-1][j-1]));
                        dp[i][j]=Math.min(c,(matrix[i][j]+dp[i-1][j+1]));
                        if(i==l-1)
                        {
                            mini=Math.min(dp[i][j],mini);
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return mini;
    }
}