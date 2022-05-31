class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(k);
        for(int i=0;i<k;i++)
            pq.add(nums[i]);
        //System.out.println(pq);
        for(int i=k;i<nums.length;i++)
        {
            if(pq.peek()<nums[i])
            {
                pq.remove();
                pq.add(nums[i]);
                
            }
        }
        //System.out.println(pq);
        return pq.remove();
    }
}