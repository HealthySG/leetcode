class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] vis=new boolean[isConnected.length+1];
        int ans=0;
        for(int i=1;i<=isConnected.length;i++)
        {
            if(vis[i]==false)
            {
                ans++;
                BFS(vis,isConnected,i);
            }
        }
        return ans;
        //BFS(vis);
    }
   public void BFS(boolean[] vis,int[][] isConnected,int i)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty())
        {
            i=q.poll();
            vis[i]=true;
            for(int j=1;j<=isConnected.length;j++)
            {
                if((i-1)!=(j-1) && isConnected[i-1][j-1]==1 && vis[j]==false)
                {
                    q.add(j);
                }
            }
        }
    }
}