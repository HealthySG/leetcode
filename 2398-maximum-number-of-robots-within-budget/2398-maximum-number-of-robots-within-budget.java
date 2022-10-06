class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int l1=chargeTimes.length,l2=runningCosts.length;
     //   int[] pref1=new int[l1];
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       // pref1[0]=chargeTimes[0];
      /*  for(int i=1;i<l1;i++)
        {
            pref1[i]=Math.max(pref1[i-1],chargeTimes[i]);
        }*/
        int size=0,i=0,j=0,charge=0;
        long sum=0;
        int ans=0;
        while(j!=l1)
        {
             sum+=runningCosts[j];
           // System.out.println("Sum is: " + sum );
           //  size++;
             pq.add(chargeTimes[j]);
           // System.out.println(sum +" "+ size);
          /*  if(size==1)
            {
                charge=chargeTimes[j];
            }
            else
            {
                charge=pref1[j];
            }*/
             if((pq.peek()+sum*pq.size())<=budget)
             {
                 ans=Math.max(pq.size(),ans);
             }
             else
             {
                 while(!pq.isEmpty() &&(pq.peek()+sum*pq.size())>budget)
                 {
                       pq.remove(chargeTimes[i]);
                     sum-=runningCosts[i];
                //  size--;
                   i++;
                 }
                  
            //     System.out.println("In else "+ sum +" "+ size);
              //  ans=Math.max(size,ans);
             }
            j++;
        }
          
        return ans;
    }
}