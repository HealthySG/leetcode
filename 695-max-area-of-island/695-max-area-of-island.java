class Solution {
    int[] dir=new int[]{0,1,0,-1,0};
    public int maxAreaOfIsland(int[][] grid) {
         int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                   
                   ans=Math.max(ans,dfs(i,j,grid));
                  //  System.out.println(ans);
                }
            }
            
        }
        return ans;
    }
    int dfs(int i,int j,int[][] grid)
    {
        if((i<0||i>=grid.length) || (j<0 || j>=grid[0].length) || grid[i][j]==0)
            return 0;
        int ans=1;
        grid[i][j]=0;
        for(int k=0;k<4;k++)
        {
            ans+=dfs(i+dir[k],j+dir[k+1],grid);
        }
       /* if(i+1<grid.length && grid[i+1][j]==1)
        {
            ans+=dfs(i+1,j,grid);
            grid[i+1][j]=0;
        }
         if(j+1<grid[0].length && grid[i][j+1]==1)
        {
            ans+=dfs(i,j+1,grid);
             grid[i][j+1]=0;
        }
         if(i-1>=0 && grid[i-1][j]==1)
        {
             ans+=dfs(i-1,j,grid);
             grid[i-1][j]=0;
        }
         if(j-1>=0 && grid[i][j-1]==1)
        {
             ans+=dfs(i,j-1,grid);
             grid[i][j-1]=0;
        }*/
        return ans;
    }
}