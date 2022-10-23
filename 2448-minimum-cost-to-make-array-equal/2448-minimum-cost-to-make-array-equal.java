class Solution {
    public long minCost(int[] nums, int[] cost) {
       // int 
       /* Pair[] p=new Pair[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            p[i]=new Pair(nums[i],cost[i]);
        }
        Arrays.sort(p,(Pair p1,Pair p2)->p1.num-p2.num);
        long ans=0L;
        if(nums.length%2==0)
        {
            int tempcost1=p[(nums.length/2)-1].num;
            long ans1=0L;
            for(int i=0;i<nums.length;i++)
            {
                ans1+=Math.abs((long)tempcost1-(long)p[i].num)*((long)p[i].cost);
            }
            int tempcost2=p[(nums.length/2)].num;
            long ans2=0L;
            for(int i=0;i<nums.length;i++)
            {
                ans2+=Math.abs((long)tempcost2-(long)p[i].num)*((long)p[i].cost);
            }
            ans=Math.min(ans1,ans2);
        }
        else
        {
            int tempcost3=p[(nums.length/2)].num;
            
            for(int i=0;i<nums.length;i++)
            {
                ans+=Math.abs((long)tempcost3-(long)p[i].num)*((long)p[i].cost);
            }
        }
        return ans;*/
        int n = nums.length;
        long l = 1, r = Long.MAX_VALUE;
        long res = 0;
        long mid = 0;
        while(l < r){
            mid = l + (r - l)/2;
            long y1 = fun(nums, cost, mid, n);
            long y2 = fun(nums, cost, mid + 1, n);
            res = Math.min(y1, y2);
            if(y1 < y2){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return res;
    }
     private long fun(int[] nums, int[] cost, long x, int n){
        long res = 0;
        for(int i = 0; i < n; i++){
            res += cost[i]*Math.abs(nums[i] - x);
        }
        return res;
    }
    
}
class Pair
{
    int num;
    int cost;
    Pair(int num,int cost)
    {
        this.num=num;
        this.cost=cost;
    }
}