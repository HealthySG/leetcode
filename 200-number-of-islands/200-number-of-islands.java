class Solution { 
    int ans=0;
    public int numIslands(char[][] grid) {
        
        int r=grid.length,c=grid[0].length;
       for(int i=0;i<r;i++)
       {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]=='1')
                {
                    ans++;
                    System.out.println("ANS is "
+ ans);
                    DFS(i,j,grid,r,c);
                }
            }
       }
        return ans;
    }
    void DFS(int i,int j,char[][] grid,int r,int c)
    {
        if(i>=0 && i<r&& (j>=0 &&j<c))
        {
            if(grid[i][j]=='1')
            {
                grid[i][j]='0';
                DFS(i+1,j,grid,r,c);
                DFS(i,j+1,grid,r,c);
                DFS(i-1,j,grid,r,c);
                DFS(i,j-1,grid,r,c);
            }
        }
    }
    
    
}