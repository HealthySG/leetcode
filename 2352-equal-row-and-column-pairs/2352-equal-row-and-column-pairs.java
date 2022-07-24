class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length,ans=0;
     /*   Pair[] row=new Pair[grid.length];
        Pair[] col=new Pair[grid[0].length];
        int k=0;
        for(int i=0;i<n;i++)
        {
            int rowsum=0;
             for(int j=0;j<n;j++)
             {
               rowsum+=grid[i][j];
              
             }
             row[i]=new Pair(rowsum,i);
            // col[k++]=colsum;
        }
        for(int j=0;j<n;j++)
        {
            int colsum=0;
             for(int i=0;i<n;i++)
             {
                  colsum+=grid[i][j];
                //  System.out.println(colsum);
             }
            
             col[j]=new Pair(colsum,j);
            // col[k++]=colsum;
        }
        Arrays.sort(row,(Pair a,Pair b)->{
            return a.sum-b.sum;
            });
        Arrays.sort(col,(Pair a,Pair b)->{
            return a.sum-b.sum;
        });
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(row[i].sum==col[j].sum)
            {
               //  System.out.println(row[i].i);
                System.out.println(row[i].sum);
                
                int rind=row[i].i;
                int cind=col[i].i;
                boolean flag=false;
                for(k=0;k<n;k++)
                {
                  if(grid[rind][k]!=grid[k][cind])
                  {
                    flag=true;
                    break;
                  }
                }
                
                if(flag==false)
                    ans++;
            }
            
        }
       // System.out.println(Arrays.toString(row));
       // System.out.println(Arrays.toString(col));
        return ans;*/
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
             {
                   boolean flag=false;
                 for(int k=0;k<n;k++)
                 {
                     
                     if(grid[i][k]!=grid[k][j])
                     {
                         flag=true;
                         break;
                     }
                    
                 }
                  if(flag==false)
                         ans+=1;
                     
             }
        }
        return ans;
              
    }
    
}
class Pair
{
    int sum;
    int i;
    Pair(int sum,int i)
    {
        this.sum=sum;
        this.i=i;
    }
}	
