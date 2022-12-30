class Solution {
     Map<Integer,List<Integer>> mp=new HashMap<>();
     List<List<Integer>> ans=new ArrayList<>();
    int d;
    // Map<Integer,Integer> mp=new HashMap<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        d=n;
        for(int i=0;i<n;i++)
       {
           mp.put(i,new ArrayList<Integer>());
           //mp.put(i,Integer.MAX_VALUE);
       }
        for(int i=0;i<n;i++)
       {
             // int src=gra[0];
             // int des=gra[1];
            for(int j=0;j<graph[i].length;j++)
            {
                 mp.get(i).add(graph[i][j]);
            }
            
       }
         ArrayList<Integer> a=new ArrayList<>();
        a.add(0);
        dfs(0,a);
        return ans;
    }
     void dfs(int src,List<Integer> a)
    {
        if(src==d-1)
        {
            List<Integer> temp=new ArrayList<Integer>(a);
            ans.add(temp);
            return;
        }
        for(int i=0;i<mp.get(src).size();i++)
        {
            a.add(mp.get(src).get(i));
            dfs(mp.get(src).get(i),a);
            if((a.size()-1)!=-1)
                a.remove(a.size()-1);
        }
    }
    
}