class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder()); 
        int d=0,sum=0;
        double g=0.0;
        for(int p:piles)
        {
            pq.add(p);
        }
        while(k-->0)
        {
            d=pq.poll();
            g=(float)d/2;
             //System.out.println("g is "+ (int)Math.ceil(g));
            pq.add((int)Math.ceil(g));
            
        }
      //  System.out.println(pq);
        while(!pq.isEmpty())
        {
            sum+=pq.poll();
        }
        return sum;
    }
}