class Solution {
    public int minPathSum(int[][] grid) {
        int height = grid.length;
            int width = grid[0].length;
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    if(row == 0 && col == 0) grid[row][col] = grid[row][col];
                    else if(row == 0 && col != 0) grid[row][col] = grid[row][col] + grid[row][col - 1];
                    else if(col == 0 && row != 0) grid[row][col] = grid[row][col] + grid[row - 1][col];
                    else grid[row][col] = grid[row][col] + Math.min(grid[row - 1][col], grid[row][col - 1]);
                }
            }
            return grid[height - 1][width - 1];
    }
//     int rec(int[][] grid,int i,int j/*,int s,int e*/)
//     {
//         if(i==grid.length-1 && j==grid[0].length-1)
//             return grid[i][j];
//         if(i==grid.length-1)
//         {
//             return grid[i][j]+rec(grid,i,j+1);
//         }
//         if(j==grid[0].length-1)
//         {
//             return grid[i][j]+rec(grid,i+1,j);
//         }
//             int op1=0,op2=0;
       
//                op1=grid[i][j]+rec(grid,i+1,j);
//         //System.out.println("op1 : " + op1);
//          op2=grid[i][j]+rec(grid,i,j+1);
//        // System.out.println("op2 : " +op2);
//          return Math.min(op1,op2);
        
            
//       //  if(i==s || j==e)
//     }
}