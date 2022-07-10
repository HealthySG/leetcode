class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        
        int ans=Integer.MIN_VALUE;
         ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
         for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
         for(int[] road:roads)
        {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }
        for(int i=0;i<graph.size();i++)
        {
            int a=graph.get(i).size();
           // System.out.println("a---" + a);
            for(int j=i+1;j<graph.size();j++)
            {
                int b=graph.get(j).size();
                if(graph.get(j).contains(i))
                {
                     ans=Math.max(ans,(a+b)-1);
                }
                else
                {
                      ans=Math.max(ans,(a+b));
                }
              //  System.out.println("b is--" + b);
               
            }
        }
        return ans;
    }
}