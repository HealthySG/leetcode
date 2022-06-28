class Solution {
    int ans=0;
    public int maximalSquare(char[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
             for(int j=0;j<matrix[0].length;j++)
             {
                 ans=Math.max(ans,rec(matrix,i,j,dp));
             }
        }
         //rec(matrix,0,0);
         return ans*ans;
    }
    int rec(char matrix[][],int i,int j,int[][] dp)
    {
        if(i==matrix.length || j==matrix[0].length)
            return 0;
        if(matrix[i][j]=='0')
            return 0;
         if(dp[i][j]!=0)
            return dp[i][j];
        int temp1=Math.min(rec(matrix,i+1,j,dp),rec(matrix,i,j+1,dp));
        int temp2=1+Math.min(temp1,rec(matrix,i+1,j+1,dp));
        //System.out.println("For the i and jthe temp2 is- "+ i+" "+j+" "+ temp2);
       // ans=Math.max(ans,temp2);
        dp[i][j]=temp2;
        return temp2;
    }
}