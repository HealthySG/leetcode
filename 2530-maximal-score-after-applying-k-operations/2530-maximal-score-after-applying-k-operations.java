class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        long ans=0;
        for(int i:nums)
            pq.add(i);
        while(k>0)
        {
            int s=pq.peek();
            ans+=s;
            pq.poll();
            //System.out.println(Math.ceil(s/3));
            pq.add((int)Math.ceil(s/3.0));
            k--;
        }
        return ans;
    }
}