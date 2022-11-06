class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        // PriorityQueue<Integer> left=new PriorityQueue<>();
        // PriorityQueue<Integer> right=new PriorityQueue<>();
        // int temp=candidates,i=0,j=costs.length-1;
        // while(temp>0)
        // {
        //     left.add(costs[i++]);
        //     temp--;
        // }
        // temp=candidates;
        //  while(temp>0)
        // {
        //     right.add(costs[j--]);
        //     temp--;
        // }
        // i=0;
        // j=costs.length-1;
        // System.out.println(left);
        // System.out.println(right);
        // int y=i+candidates;
        // System.out.println("y--"+ y);
        // int z=costs.length-1-candidates;
        //  System.out.println("z--"+ z);
        // long ans=0L;
        // while(k>0)
        // {
        //     System.out.println(left.peek());
        // System.out.println(right.peek());
        //     if(left.peek()<=right.peek())
        //     {
        //         ans+=left.poll();
        //         if(y<=z)
        //         {
        //             left.add(costs[y++]);
        //         }
        //     }
        //     else if(left.peek()>right.peek())
        //     {
        //         ans+=right.poll();
        //         if(z>y)
        //         {
        //             right.add(costs[z--]);
        //         }
        //     }
        //     k--;
        // }
        // return ans;
           PriorityQueue<Integer> p1 = new PriorityQueue<>(); // left prioityqueue
        PriorityQueue<Integer> p2 = new PriorityQueue<>(); // right priroityqueue
        int i = 0;int j = costs.length-1; // left && right pointers
        int count = 0; // counter
        long ans = 0;
        while(count<k){
            while(p1.size()<candidates && i<=j){p1.add(costs[i]);i++;}
            while(p2.size()<candidates && j>=i){p2.add(costs[j]);j--;}
            
            int a = p1.isEmpty()?Integer.MAX_VALUE:p1.peek(); // if we don't have any elements to fill in left pq we will have zero size so then a will be int_max
            int b = p2.isEmpty()?Integer.MAX_VALUE:p2.peek(); // similarly for b
            
            if(a>b){
                ans += b;p2.poll();
            }
            else{
                ans += a;p1.poll();
            }
            count++;
        }
        return ans;
    }
}