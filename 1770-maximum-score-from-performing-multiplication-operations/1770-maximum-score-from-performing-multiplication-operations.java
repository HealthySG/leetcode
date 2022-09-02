/*class Solution {
    
    public int maximumScore(int[] nums, int[] multipliers) {
        int ans=0,i=0,j=nums.length-1;
        int m=multipliers.length;
        //Map<String,Integer> mp=new HashMap<>();
        int[][] dp=new int[m][m]; 
        return rec(nums,multipliers,i,0,dp);
    }
    int rec(int[] nums, int[] multipliers,int start,int k,int[][] dp)
    {
//System.out.println(i+ " " + " " + k);
        if(k==multipliers.length)
            return 0;
        
        int op1=multipliers[k]*nums[i]+rec(nums,multipliers,i+1,k+1,dp);
        int op2=multipliers[k]*nums[j]+rec(nums,multipliers,multipliers.length-(start-l)-1k+1,dp);
       dp[(key,Math.max(op1,op2));
        return mp.get(key);
    }
}*/
class Solution {
    int n, m;
    int[] nums, muls;
    Integer[][] memo;
    public int maximumScore(int[] nums, int[] muls) {
        n = nums.length;
        m = muls.length;
        this.nums= nums;
        this.muls = muls;
        this.memo = new Integer[m][m];
        return dp(0, 0);
    }
    private int dp(int l, int i) {
        if (i == m) return 0; // Picked enough m elements
        if (memo[l][i] != null) return memo[l][i];
        int pickLeft = dp(l+1, i+1) + nums[l] * muls[i]; // Pick the left side
        int pickRight = dp(l, i+1) + nums[n-(i-l)-1] * muls[i]; // Pick the right side
        return memo[l][i] = Math.max(pickLeft, pickRight);
    }
}