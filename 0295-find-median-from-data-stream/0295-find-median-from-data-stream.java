class MedianFinder {
    //int[] inp;
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
    //    inp=new int[n];
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        // if(max.size()==0)
        //   max.add(num);
//         if(!max.isEmpty() && max.peek()>num)
//         {
//             min.add(max.poll());
//             max.add(num);
//         }
//         else
//         {
            
//         }
        if((min.size()+max.size())%2==0)
        {
              max.add(num);
              min.add(max.poll());
        } 
        else
        {
              min.add(num);
              max.add(min.poll());  
        }
        // System.out.println(max);
        // System.out.println(min);
    }
    
    public double findMedian() {
        if((min.size()+max.size())%2==0)
             return ((max.peek()+min.peek())/2.0);
        else
            return min.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */