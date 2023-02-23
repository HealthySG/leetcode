class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
       Pair[] p=new Pair[n];
        for(int i=0;i<n;i++)
        {
            p[i]=new Pair(nums1[i],nums2[i]);
        }
        Arrays.sort(p,(Pair a,Pair b)->b.num2-a.num2);
        for(int i=0;i<n;i++)
        {
            System.out.println(p[i].num1+" "+ p[i].num2);
        }
        int j=k;
        long ans=Long.MIN_VALUE;
        PriorityQueue<Integer> pq=new PriorityQueue<>(k);
        long sum=0L;
        for(int i=0;i<n;i++)
        {
           pq.add(p[i].num1);
            sum = (sum + p[i].num1);
            if (pq.size() > k) sum -= pq.poll();
            if (pq.size() == k) ans = Math.max(ans, (sum *  p[i].num2));
        }
//           long bhai=p[k-1].num2*sum;
//          ans=Math.max(ans,bhai);
      
//         while(j<n)
//         {
//             int min=p[j].num2;
//             if(p[j].num1>pq.peek())
//             {
//                 sum-=pq.peek();
//                 sum+=p[j].num1;
//                 pq.poll();
//                 pq.add(p[j].num1);
//             }
//              bhai=min*sum;
//             ans=Math.max(ans,bhai);
//             j++;
            
//         }
      return ans;
    }
}
class Pair{
    int num1;
    int num2;
    Pair(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
}