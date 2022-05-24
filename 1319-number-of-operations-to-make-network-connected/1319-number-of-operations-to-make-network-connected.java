class Solution {
    public int makeConnected(int n, int[][] connections) {
      int parent[] = new int[n];
	  for(int i =0; i <n; i++)
		  parent[i] = i;
      int cycle=0,unconnectedcomp=0;
        for(int[] l:connections)
        {
            int from=l[0];
            int to=l[1];
            
          //  System.out.println("From parent-- " + find(from,parent));
           // System.out.println("to parent-- " + find(to,parent));
            if(find(from,parent)==find(to,parent))
            {
                cycle++;
            }
          //  System.out.println("Cycle--"+ cycle);
            union(from, to, parent);
            
        }
        for(int i=0;i<n;i++) {
            if(parent[i] == i) unconnectedcomp++;
        }
          if(cycle>=unconnectedcomp-1)
            {
                return unconnectedcomp-1;
            }
            else
            {
                return -1;
            }
         //return -1;
    }
    public void union(int from, int to, int[] parent)     {
        from = find(from, parent);
        to = find(to,parent);
        
        parent[to] = from;
    }
    public int find(int from,int[] parent)
    {
        if(parent[from]==from)
            return from;
        return find(parent[from],parent);
    }
}