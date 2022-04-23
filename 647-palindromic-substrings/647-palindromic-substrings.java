class Solution {
    public int countSubstrings(String s) {
             int j=s.length();
       int[][] Dp=new int[j][j];
       int count=0;
       for(int i=0;i<j;i++)
       {
           Dp[i][i]=1;
           count++;
       }
       for(int i=0;i<j-1;i++)
       {
           if(s.charAt(i)==s.charAt(i+1))
           {
               Dp[i][i+1]=1;
               count++;
           }
           else
           {
               Dp[i][i+1]=0;
           }
       }
       for(int k=3;k<=j;k++)
       {
           for(int i=0;i<j-k+1;i++)
           {
               int h=i+k-1;
               if(s.charAt(i)==s.charAt(h) && Dp[i+1][h-1]==1)
               {
                   Dp[i][h]=1;
                   count++;
               }
               else
               {
            	   Dp[i][h]=0;
               }
           }
       }
     // System.out.println(s.substring(start, start+max_length));  
       return count; 
    }
}