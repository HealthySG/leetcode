// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code 
       /* for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.println(" For i --> j"+ i + " "+ adj.get(i).get(j));
            }
        }
        boolean[] vis=new boolean[V];
        boolean[] dfs=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                if(check(i,adj,vis,dfs))
                {
                    return true;
                }
            }
        }
        return false;
        
    }
    boolean check(int i,ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] dfs)
    {
        vis[i]=true;
        dfs[i]=true;
        for(int it:adj.get(i))
        {
            if(vis[it]==false)
            {
                if(check(it,adj,vis,dfs))
                {
                    return true;
                }
            }
            else if(dfs[it]==true)
            {
                return true;
            }
           
        }
         dfs[i]=false; 
         return false;*/
         int dfsvisted[] = new int[V];
		int visited[] = new int[V];
		for(int i=0;i<V;i++)
		{
		    if(visited[i]==0)
		    {
		        if(checkcycle(i,adj,visited,dfsvisted)==true)
		        {
		            return true;
		        }
		    }
		}
	    return false;	
    }
   private boolean checkcycle(int node,ArrayList<ArrayList<Integer>> adj,int visited[],int dfsvisted[])
    {
         //System.out.println("check for cycle "+node);
        visited[node]=1;
        dfsvisted[node]=1;
        for(Integer it:adj.get(node))
        {
             //System.out.println("check for ajj nodes "+it);
            if(visited[it]==0)
            {
                if(checkcycle(it,adj,visited,dfsvisted)==true)
                {
                    return true;
                }
            }
            else if(dfsvisted[it]==1)
            {
                 return true;
            }
        }
         dfsvisted[node]=0;
         return false;
    }
}