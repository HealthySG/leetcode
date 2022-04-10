class Solution {
    static int mod=1000000007;
    public int maximumProduct(int[] nums, int k) {
        long ans=1;
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(int num:nums)
            pq.add(num);
        while(k!=0)
        {
            int d=pq.poll();
            d+=1;
            pq.add(d);
            k--;
        }
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
             ans=ans*(pq.poll()%mod);
             ans=ans%mod;
        }
        return (int)ans;
    }
}