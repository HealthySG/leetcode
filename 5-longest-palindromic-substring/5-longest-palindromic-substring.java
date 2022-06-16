class Solution {
    public String longestPalindrome(String s) {
       int j=s.length();
       int[][] Dp=new int[j][j];
       int max_length=1;
       int start=0;
       for(int i=0;i<j;i++)
       {
           Dp[i][i]=1;
       }
       for(int i=0;i<j-1;i++)
       {
           if(s.charAt(i)==s.charAt(i+1))
           {
               Dp[i][i+1]=1;
               start=i;
               max_length=2;
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
                   if(k>max_length)
                   {
                       max_length=k;
                       start=i;
                   }
               }
               else
               {
            	   Dp[i][h]=0;
           }
       }
     // System.out.println(s.substring(start, start+max_length));  
   }
       return (s.substring(start, start+max_length)); 
}
}