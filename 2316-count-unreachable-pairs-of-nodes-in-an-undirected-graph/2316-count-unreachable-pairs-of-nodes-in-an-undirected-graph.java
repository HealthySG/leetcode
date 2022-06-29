class Solution {
     List<List<Integer>> x = new ArrayList<>();
   // int c=0;
    public long countPairs(int n, int[][] edges) {
       
        for(int i=0;i<n;i++)
            x.add(new ArrayList<>());
        for(int[] edge:edges)
        {
            x.get(edge[0]).add(edge[1]);
            x.get(edge[1]).add(edge[0]);
        }
        boolean[] vis=new boolean[n];
        int c=0;
        long ans=0L,sum=n;
      for(int i=0;i<n;i++)
      {
          if(!vis[i])
          {
              c=dfs(vis,i,new int[1]);
              // System.out.println(c);
               sum=sum-c;
                ans+=sum*(c);
                
          }
          
      }
        return ans;
    }
    /*    long res=0;
      int parent[] = new int[n];
	  for(int i =0; i <n; i++)
		  parent[i] = i;
      for(int i=0;i<edges.length; i++) {
          int src=find(edges[i][0],parent);
          int des=find(edges[i][1],parent);
          if(src!=des)
          {
              parent[des]=src;
          }
          
      }
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<m)
        for(int j=0;j<n;j++)
        {
            a[parent[j]]++;
        }
       // Arrays.sort(a);
     //   reverse(a);
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==a.length)
                return 0;
            res += a[i] * (n-a[i]);
        }
           

   // System.out.println(Arrays.toString(a));
      return res/2;
    }
    int find(int v,int[] parent)
    {
        if(parent[v] == v)
		  return v;
	    return find(parent[v], parent);
    }
    public static void reverse(int[] array)
    {
  
        // Length of the array
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
    */
    int dfs(boolean[] vis,int i,int[] count)
    {
       if(vis[i]==true)
           return count[0];
       count[0]++;
       // System.out.println("c in dfs--" + c);
       vis[i]=true;
       for(int j:x.get(i))
       {
           dfs(vis,j,count);
       }
       return count[0];
    }
    

}