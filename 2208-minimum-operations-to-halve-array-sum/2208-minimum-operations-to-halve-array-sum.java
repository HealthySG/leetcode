class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0L;
        for(int i:nums)
        {
            pq.add((double)i);
            sum+=i;
        }
        
        System.out.println(sum);
         //PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());    
       // double half = IntStream.of(nums).mapToLong(i -> i).sum() / 2d;
        double half =sum/2d;
        /*for (int n : nums) {
            pq.offer((double)n);
        }
        */
        int ops = 0;
        while (half > 0) {
            double d = pq.poll();
            d /= 2;
            half -= d;
            pq.offer(d);
            ++ops;
        }
        return ops;
    }
}