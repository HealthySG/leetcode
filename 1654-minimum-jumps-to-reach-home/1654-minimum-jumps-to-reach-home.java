/*class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<Integer> st=new HashSet<>();
        for(int i:forbidden)
        {
            st.add(i);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        int l=0;
        boolean flag=true;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int ele=q.poll();
                System.out.println(ele);
                if(ele-b>x)
                    break;
                if(ele==x)
                {
                    System.out.println("calculated position ->"+ele);
                    return l;
                }
                if((ele+a)-x<=b && !st.contains((ele+a)))
                {
                     q.add(ele+a);
                  //   flag=true;
                }
                if((ele-b)>0 && !st.contains(ele-b) && (flag==true))
                {
                    q.add(ele-b);
                    flag=false;
                }
                    
                
            }
            l++;
        }
        return -1;
    }
}*/
class Solution {
    class Pair {
        int pos;
        boolean dir;
        public Pair(int pos, boolean dir) {
            this.pos = pos;
            this.dir = dir;
        }
    }
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int limit = 2000 + 2 * b + 1;
        boolean[] visited = new boolean[limit];
        for (int num: forbidden) {
            visited[num] = true;
        }
        int step = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, false));
        visited[0] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int pos = p.pos;
                boolean dir = p.dir;
              
                if (pos == x) return step;
                
                if (dir==false) {
                    int backward = pos - b;
                  
                    if (backward > 0 && !visited[backward]) {
                        q.offer(new Pair(backward, true));
                        visited[backward] = true;
                    }
                }
                
                int forward = pos + a;
           
                if (forward < limit && !visited[forward]) {
                    q.offer(new Pair(forward, false));
                    visited[forward] = true;
                }
              
                
            }
            step++;
        }
        return -1;
    }
}