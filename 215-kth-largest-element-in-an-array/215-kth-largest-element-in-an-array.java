class Solution {
    public int findKthLargest(int[] nums, int k) {
      /*  PriorityQueue<Integer> pq=new PriorityQueue<>(k);
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
        return pq.remove();*/
          k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
           // System.out.println("final j is " + j);
            if(j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }
     int partition(int[] a, int lo, int hi) {

        int i = lo;
        int j = hi + 1;
        while(true) {
            while(i < hi && less(a[++i], a[lo]));
          //  System.out.println("i is " + i);
            while(j > lo && less(a[lo], a[--j]));
            // System.out.println("j is " + j);
            if(i >= j) {
                break;
            }
            exch(a, i, j);
            
        }
       //  System.out.println(Arrays.toString(a));
        exch(a, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private boolean less(int v, int w) {
        return v < w;
    }
}