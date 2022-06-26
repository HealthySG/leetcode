class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=cardPoints.length;
        int i=0,j=l-k,b_sum=0,f_sum=0,ans=Integer.MIN_VALUE;
        // b_sum:- Backward sum
        // f_sum:-forward sum
        while(j<l)
        {
            b_sum+=cardPoints[j++];
        }
        ans=b_sum;
        j=l-k;
        while(i<k )
        {
            f_sum+=cardPoints[i];
            b_sum-=cardPoints[j+i];
            ans=Math.max(ans,f_sum+b_sum);
            i++;
        }
        return ans;
    }
}