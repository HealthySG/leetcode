class Solution {
    Map<Integer,List<Integer>> graph=new HashMap<>();
    Map<Integer,Integer> mp=new HashMap<>();
    Set<Integer> st=new HashSet<>();
     int ans=Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
    //     int[] parant=new int[n];
    //     int[] val=new int[n];
    //     Arrays.fill(val,Integer.MAX_VALUE);
    //     for(int i=0;i<n;i++)
    //     {
    //         parant[i]=i+1;
    //     }
    //     for(int i=0;i<roads.length;i++)
    //     {
    //         int src=roads[i][0];
    //         int des=roads[i][1];
    //         int src_parent=find(src,parent);
    //         int des_parent=find(des,parent);
    //         if(src_parent!=des_parent)
    //             parent[des_parent]=src_parent;
    //     }
    // }
    // int find(int node,int[] parent)
    // {
    //     if(parent[node]==n+1)
    //         return n+1;
    //     return find(node,parent);
    // }
       for(int i=1;i<=n;i++)
       {
           graph.put(i,new ArrayList<Integer>());
           mp.put(i,Integer.MAX_VALUE);
       }
       for(int[] road:roads)
       {
           int src=road[0];
           int des=road[1];
           int d=road[2];
           mp.put(src,Math.min(d,mp.get(src)));
           graph.get(src).add(des);
           graph.get(des).add(src);
           mp.put(des,Math.min(d,mp.get(des)));
       }
       System.out.println(mp);
       dfs(1);
        return ans;
    }
    void dfs(int src)
    {
        st.add(src);
        List<Integer> nei=graph.get(src);
        for(int j=0;j<nei.size();j++)
        {
            int road=nei.get(j);
            if(!st.contains(road))
            {
                 ans=Math.min(mp.get(road),ans);
                 dfs(road);
            }
        }
    }
}