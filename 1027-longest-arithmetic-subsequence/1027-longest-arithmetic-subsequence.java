class Solution {
    public int longestArithSeqLength(int[] nums) {
        Map<Integer,Integer>map= new HashMap<>();
        int ans=0;Map<Integer,Integer>dp[]=new HashMap[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=new HashMap<>();
            for(int j=0;j<i;j++){
                int dif=nums[i]-nums[j];
                int val=1+dp[j].getOrDefault(dif,0);
                ans=Math.max(ans,val);
                dp[i].put(dif,val);
            }
        }
        return ans+1;

    }
    // int rec(int[] nums,int i,int prev,int diff,Integer[][][] dp)
    // {
    //     if(i>=nums.length)
    //         return 0;
    //     if(prev!=-1 && dp[i][prev][diff]!=null)
    //         return dp[i][prev][diff];
    //     int op1=0,op2=0;
    //     if((nums[i]-prev)==diff || diff==Integer.MAX_VALUE)
    //     {
    //          int temp=diff;
    //          if(prev!=-1)
    //              temp=nums[i]-prev;
    //          op1=1+rec(nums,i+1,nums[i],temp,dp); 
    //     }
    //      op2=rec(nums,i+1,prev,diff,dp);
    //     dp[i][prev][diff]=Math.max(op1,op2);
    //     return Math.max(op1,op2);
    // }
}