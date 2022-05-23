/*
/*class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer,List<Node>> m=new HashMap<>();
        for(int i=0;i<flights.length;i++)
        {
            if(m.containsKey(flights[i][0]))
            {
                List<Node> g=m.get(flights[i][0]);
                g.add(new Node(flights[i][1],flights[i][2]));
            }
            else
            {
                 List<Node> g=new ArrayList<Node>();
                 g.add(new Node(flights[i][1],flights[i][2]));
                 m.put(flights[i][0],g);
            }
        }
       // System.out.println(m);
        PriorityQueue<Node2> pq=new PriorityQueue<>(new NodeComparator());
        pq.add(new Node2(src,0,k));
        while(!pq.isEmpty())
        {
            Node2 curr=pq.poll();
           // System.out.println(curr.des + " " + curr.cost + " " +curr.r);
            if(curr.des==dst)
                return curr.cost;
            if(curr.r>=0)
            {
                if(!m.containsKey(curr.des))
                    continue;
                else
                {
                      List<Node> g=m.get(curr.des);
                      for(int i=0;i<g.size();i++)
                      {
                          pq.offer(new Node2(g.get(i).des,g.get(i).cost+curr.cost,curr.r-1));
                      }
                }
            }
            else
            {
                break;
            }
        }
        return -1;
    }
}
class Node
{
 int des;
 int cost;
 public Node(int d,int c)
 {
    des=d;
    cost=c;
 }
}
class Node2
{
 int des;
 int cost;
 int r;
 public Node2(int d,int c,int k)
 {
    des=d;
    cost=c;
    r=k;
 }
}
class NodeComparator implements Comparator<Node2>{
    public int compare(Node2 s1, Node2 s2) {
      return Integer.compare(s1.cost,s2.cost);
}
}
*/
/*
class Solution {
   public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) 
    {
        Map<Integer,List<int[]>> map=new HashMap<>();
        for(int[] f:flights)
        {
            map.putIfAbsent(f[0],new ArrayList<>());
            map.get(f[0]).add(new int[]{f[1],f[2]});
        }
        PriorityQueue<int[]> q=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });
        q.offer(new int[]{src,0 ,K});
        while(!q.isEmpty())
        {
            int[] c=q.poll();
            int curr=c[0];
            int cost=c[1];
            int stop=c[2];
            if(curr==dst)
                return cost;
            if(stop<-1)
                break;
            if(stop>=0)
            {   
                if(!map.containsKey(curr))
                    continue;
                for(int[] next:map.get(curr))
                {
                    q.add(new int[]{next[0], cost+next[1], stop-1});
                }
            }
           
        }
        return -1;
    }
}*/
class Solution {
    class Pair{
        int v;
        int wt;
        int dist;
        
        Pair(int v, int wt, int dist){
            this.v = v;
            this.wt = wt;
            this.dist = dist;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] edge : flights){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            
            graph.get(u).add(new Pair(v, wt, 0));
            
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
        pq.add(new Pair(src, 0, -1));
        int[] stop = new int[n];
        Arrays.fill(stop, Integer.MAX_VALUE);
        
        while(pq.size() > 0){
            Pair p = pq.remove();
            if(p.dist > k || stop[p.v] < p.dist)continue;
            
            stop[p.v] = p.dist;
            if(p.v == dst)return p.wt;

            for(Pair nbr : graph.get(p.v)){
                pq.add(new Pair(nbr.v, p.wt + nbr.wt, p.dist + 1));
                
            }
            
        }
        return -1;
    }
}