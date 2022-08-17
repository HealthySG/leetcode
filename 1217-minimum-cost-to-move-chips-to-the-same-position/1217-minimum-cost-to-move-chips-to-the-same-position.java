class Solution {
    public int minCostToMoveChips(int[] position) {
        int[] ans=new int[2];
       for(int i=0;i<position.length;i++)
       {
           if((position[i]&1)==0)
           ans[1]++;
           else
               ans[0]++;
       }
       return Math.min(ans[0],ans[1]); 
    }
}