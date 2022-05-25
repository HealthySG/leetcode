/*class Solution {
    //static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int ans=0,i=0,j=0;
        int[][] a=new int[m][n];
        for(int[] g:guards)
        {
            a[g[0]][g[1]]=1;
        }
        for(int[] w:walls)
        {
            a[w[0]][w[1]]=-1;
        }
        System.out.println(Arrays.deepToString(a));
        int k=0;
        for(i=0;i<n;i++)
        {
        k=0;
         for(j=0;j<m;j++)
         {
            if(a[i][j]==1)
            {
                k=1;
            }
            else if(a[i][j]==-1)
            {
                k=0;
            }
            else
            {
                if(k==1)
                {
                    a[i][j]=2;
                }
            }
         }
        //System.out.println(Arrays.deepToString(a));
        }
         for( i=0;i<n;i++)
        {
          k=0;
         for(j=m-1;j>=0;j--)
         {
            if(a[i][j]==1)
            {
                k=1;
            }
            else if(a[i][j]==-1)
            {
                k=0;
            }
            else
            {
                if(k==1)
                {
                    a[i][j]=2;
                }
            }
         }
        }
        for(j=0;j<m;j++)
        {
          k=0;
         for( i=0;i<n;i++)
         {
            if(a[i][j]==1)
            {
                k=1;
            }
            else if(a[i][j]==-1)
            {
                k=0;
            }
            else
            {
                if(k==1)
                {
                    a[i][j]=2;
                }
            }
         }
        }
        
        for(j=0;j<m;j++)
        {
          k=0;
         for(i=n-1;i>=0;i--)
         {
            if(a[i][j]==1)
            {
                k=1;
            }
            else if(a[i][j]==-1)
            {
                k=0;
            }
            else
            {
                if(k==1)
                {
                    a[i][j]=2;
                }
            }
         }
        }
        for(int[] u:guards)
        {
            for(int v:u)
            {
                if(v==0)
                  ans++;
            }
        }
         return ans;
    }
       
    }
*/
class Solution {
    public int countUnguarded(int n, int m, int[][] guards, int[][] walls) {
        int[][] grid = new int[n][m];
        //1-> guard
        //2-> walls 
        //3-> guarded
        //0-> not guarded
		
		//putting values for guard
        for(int[] i : guards) {
            grid[i[0]][i[1]] = 1;
        }
        
		//putting values for walls
        for(int[] i : walls) {
            grid[i[0]][i[1]] = 2;
        }
        
		//traversing guards
        for(int j = 0; j < guards.length; j++) {
			//x and y co ordinate for guard
            int x = guards[j][0], y = guards[j][1];
            
			//traversing right side of guard
            for(int i = x+1; i < n; i++) {
			
				//if not guarded, guard the walls
                if(grid[i][y] == 0) grid[i][y] = 3;
				
				//breaking if encountered a wall or guard (as we will be traversing for that guard while traversing "guards" array)
                else if(grid[i][y] == 2 || grid[i][y] == 1) break;
            }
            
			//traversing left side of guard
            for(int i = x-1; i >= 0; i--) {
			
				//if not guarded, guard the walls
                if(grid[i][y] == 0) grid[i][y] = 3;
				
				//breaking if encountered a wall or guard (as we will be traversing for that guard while traversing "guards" array)
                else if(grid[i][y] == 2 || grid[i][y] == 1) break;
            }
            
			//traversing upper side of guard
            for(int i = y+1; i < m; i++) {
			
				//if not guarded, guard the walls
                if(grid[x][i] == 0) grid[x][i] = 3;
				
				//breaking if encountered a wall or guard (as we will be traversing for that guard while traversing "guards" array)
                else if(grid[x][i] == 2 || grid[x][i] == 1) break;
            }
            
			//traversing lower side fo guard
            for(int i = y-1; i >= 0; i--) {
			
				//if not guarded, guard the walls
                if(grid[x][i] == 0) grid[x][i] = 3;
				
				//breaking if encountered a wall or guard (as we will be traversing for that guard while traversing "guards" array)
                else if(grid[x][i] == 2 || grid[x][i] == 1) break;
            }
        }
        
        int ans = 0;
        for(int i =0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 0) ans++;
            }
        }
        return ans;
    }
}