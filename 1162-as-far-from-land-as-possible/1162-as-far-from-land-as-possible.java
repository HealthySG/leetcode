class Solution {
    public int maxDistance(int[][] grid) {
    /*  int l=grid.length;
       Queue<Pair> q=new LinkedList<>();
    int[][] dir=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
      //boolean[][] vis=new boolean[l][l];
       for(int i=0;i<l;i++)
       {
           for(int j=0;j<l;j++)
           {
               if(grid[i][j]==1)
               {
                  // Pair p=new ;
                   q.offer(new Pair(i,j));
                   
               }
           }
       }
        int ans=0;
       while(!q.isEmpty())
       {
           // ans++;
           for(int i=0;i<q.size();i++)
           {
             Pair p=q.poll();
             for(int j=0;j<4;j++)
             {
               int row=p.i+dir[j][0];
               int col=p.j+dir[j][1];
               if(row<0 || row>=l || col<0 || col>=l || grid[row][col]==1)
               {
                 continue;  
               }
            System.out.println("Row " + row + "Col " + col);
               q.offer(new Pair(row,col));
               grid[row][col]=1;
             }
           }
           
          // System.out.println(Arrays.deepToString(grid));
          ans++;
            System.out.println(ans);
       }
       return ans;
       */
         int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int level = -1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int[] dir : dirs) {
                    int r = point[0] + dir[0];
                    int c = point[1] + dir[1];
                    if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c]) continue;
                    queue.add(new int[]{r, c});
                    visited[r][c] = true;
                }
            }
            level++;
        }
        return level <= 0 ? -1 : level;
   }
    
}
class Pair
{
    int i;
    int j;
    Pair(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}	