class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<n;i++)
            list.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++)
            adj.get(edges[i][0]).add(edges[i][1]);
        for(int i=0;i<n;i++){
            Queue<Integer> q=new ArrayDeque<>();
            boolean[] vis=new boolean[n];
            q.add(i);
            vis[i]=true;
            while(!q.isEmpty()){
                int node=q.remove();
                
                if(node!=i)
                    list.get(node).add(i);
                for(int ele:adj.get(node)){
                    if(!vis[ele]){
                        vis[ele]=true;
                        q.add(ele);
                    }
                }
            }
        }
        
        for(int i=0;i<n;i++)
            Collections.sort(list.get(i));
        return list;
    }
}