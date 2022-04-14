class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] a=nums;
    /*    if(nums == null || k <= 0) return new int [0];
    int [] arr = new int[nums.length - k + 1];
    for(int i = 0; i < nums.length - k + 1; i++){
        int max = Integer.MIN_VALUE;
        for(int j = i; j < i + k; j++)
           max = Math.max(max, nums[j]);
        arr[i] = max;
    }
    return arr; 
    */
     /*   int [] arr = new int[nums.length - k + 1];
        int j=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<k;i++)
        {
            while(!q.isEmpty() || nums[q.peek()]<nums[i])
                q.pop();
            q.offer(i);
            
        }
        for(int i=k;i<nums.length;i++)
        {
            arr[j++]=nums[q.peek()];
            while(!q.isEmpty() || nums[q.peek()]<nums[i])
                q.pop();
            q.offer(i);
            
        }
        */
        if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			// q contains index... r contains content
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
			}
		}
		return r;
        
    }
}