class Solution {
    int res=0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count=0;
        for(int i=0;i<grid2.length;i++)
        {
            for(int j=0;j<grid2[0].length;j++)
            {
                if(grid2[i][j]==1)
                {
                    count+=rec(i,j,grid1,grid2);
                }
            }
        }
        return count;
       
    }
     int rec(int i,int j,int[][] grid1, int[][] grid2)
     {
         int res=1;
         if((i<0 || i==grid2.length || j<0 || j==grid2[0].length) || grid2[i][j]==0)
             return 1;
         grid2[i][j]=0;
         res&=rec(i+1,j,grid1,grid2);
         res&=rec(i,j+1,grid1,grid2);
         res&=rec(i-1,j,grid1,grid2);
         res&=rec(i,j-1,grid1,grid2);
         return res&grid1[i][j];
     }
}