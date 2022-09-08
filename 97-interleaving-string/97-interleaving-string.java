class Solution {
    int l1,l2,l3;
    public boolean isInterleave(String s1, String s2, String s3) {
        this.l1=s1.length();
        this.l2=s2.length();
        this.l3=s3.length();
        boolean[][] dp=new boolean[l1+1][l2+1];
        /*for(int i=1;i<=l1;i++)
        {
             for(int i=1;i<=l2;i++)
             {
                 
             }
        }*/
       if(l1+l2!=l3)
           return false;
        if(s1.equals("") && !s2.equals(s3))
            return false;
        if(s2.equals("") && !s1.equals(s3))
            return false;
        if(s1.equals("") && s2.equals("") && !s3.equals(""))
             return false;
      //  int[][] dp=new int[l1+1][l2+1];
        return BottomUp(dp,s1,s2,s3);
        //return isInterleave(s1,s2,s3,0,0,0,dp);
    }
    //Top-Down TLE
/*    boolean isInterleave(String s1, String s2, String s3,int i,int j,int k,boolean[][] dp)
    {
        if(k==l3 && i==l1 && j==l2)
        {
            return true;
        }
        if(dp[l1][l2]!=null)
            return dp[l1][l2];
        if(i<l1 && j<l2 && s1.charAt(i)==s3.charAt(k) && s2.charAt(j)==s3.charAt(k) )
        {
            dp[l1][l2] =(isInterleave(s1,s2,s3,i+1,j,k+1,dp) || isInterleave(s1,s2,s3,i,j+1,k+1,dp));
        }
        else if(i<l1 && s1.charAt(i)==s3.charAt(k) && isInterleave(s1,s2,s3,i+1,j,k+1,dp))
             return true;
        else if(j<l2  && s2.charAt(j)==s3.charAt(k) && isInterleave(s1,s2,s3,i,j+1,k+1,dp))
        {
             return true;
        }
          dp[l1][l2] =false;
        return false;
    }*/
    boolean BottomUp(boolean[][] dp,String s1, String s2, String s3)
    {
        for(int i=0;i<=l1;i++)
    {
        for(int j=0;j<=l2;j++)
        {
            if(i==0 && j==0)
            {
                dp[i][j]=true;
            }
            else if(i==0)
            {
                dp[i][j]=dp[i][j-1] &&(s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
            else if(j==0)
            {
                dp[i][j]=dp[i-1][j] &&( (s1.charAt(i-1) == s3.charAt(i + j - 1)));
            }
             else
             {
                dp[i][j]=(dp[i-1][j] &&(s1.charAt(i-1) == s3.charAt(i + j - 1)) || (dp[i][j-1] &&( s2.charAt(j - 1) == s3.charAt(i + j - 1))));
             }
        }
        
    }
         return dp[l1][l2];
    }
    
   
}