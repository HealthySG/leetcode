class Solution {
    public int countServers(int[][] grid) {
       // return 0;
        int ans=0;
        int[] rc=new int[grid.length];
        int[] cc=new int[grid[0].length];
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    rc[i]++;
                    cc[j]++;
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1 && (rc[i]>1 || cc[j]>1))
                {
                   ans++;
                }
            }
        }
        return ans;
    }
}