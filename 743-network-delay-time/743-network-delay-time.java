/*class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
       /* Map<Integer,Set<Node>> m=buildgraph(times);
        Set<Integer> vis=new HashSet<>();
        buildgraph(times);
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.dis-b.dis);
        int time=Integer.MIN_VALUE;
        pq.offer(new Node(k,0));
        while(!pq.isEmpty())
        {
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                Node p=pq.poll();
                if(vis.contains(p.data))
                   continue;
                vis.add(p.data);
                if(vis.size()==n)
                    return time;
                time=Math.max(p.dis,time);
                System.out.println(time);
                 if(m.containsKey(p.data))
                 {
                     for(Node child:m.get(p.data))
                     {
                         int childtime=child.dis+p.dis;
                         pq.offer(new Node(p.data,childtime));
                     }
                 }
            } 
        }
        return -1;
}
  Map<Integer,Set<Node>> buildgraph(int[][] times)
    {
        Map<Integer,Set<Node>> m=new HashMap<>();
        for(int[] time:times){
            m.putIfAbsent(time[0],new HashSet<Node>());
            m.get(time[0]).add(new Node(time[1],time[2]));
        }   
        //return 
        
    Map<Integer, List<int[]>> graph = new HashMap<>();
    for (int[] edge: times) {
        graph.putIfAbsent(edge[0], new ArrayList<>());
        graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
    }
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
    boolean[] visited = new boolean[n+ 1];
    int[] minDis = new int[n + 1];
    Arrays.fill(minDis, Integer.MAX_VALUE);
    minDis[k] = 0;
    pq.offer(new int[]{0, k});
    int max = 0;
    while (!pq.isEmpty()) {
        int[] curr = pq.poll();
        int currNode = curr[1];
        if (visited[currNode]) continue;
        visited[currNode] = true;
        int currDis = curr[0];
        max = currDis;
        n--;
        if (!graph.containsKey(currNode)) continue;
        for (int[] next : graph.get(currNode)) {
            if (!visited[next[0]] && currDis + next[1] < minDis[next[0]])
                pq.offer(new int[]{currDis + next[1], next[0]});
        }
    }
    return n == 0 ? max : -1;
    }
}*/
class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, Map<Integer,Integer>> map = new HashMap<>();
        for(int[] time : times){
            map.putIfAbsent(time[0], new HashMap<>());
            map.get(time[0]).put(time[1], time[2]);
        }
        
        //distance, node into pq
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] - b[0]));
        
        pq.add(new int[]{0, K});
        
        boolean[] visited = new boolean[N+1];
        int res = 0;
        
        while(!pq.isEmpty()){
            int[] cur = pq.remove();
            int curNode = cur[1];
            int curDist = cur[0];
            if(visited[curNode]) continue;
            visited[curNode] = true;
            res = curDist;
            N--;
            if(map.containsKey(curNode)){
                for(int next : map.get(curNode).keySet()){
                    pq.add(new int[]{curDist + map.get(curNode).get(next), next});
                }
            }
        }
        return N == 0 ? res : -1;
            
    }
}
 class Node
{
    int data;
    int dis;
    Node(int data,int dis)
    {
        this.data=data;
        this.dis=dis;
    }
}
