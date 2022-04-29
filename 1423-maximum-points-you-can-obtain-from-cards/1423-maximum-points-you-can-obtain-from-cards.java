class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=cardPoints.length;
        int i=0,j=l-k,b_sum=0,f_sum=0,ans=Integer.MIN_VALUE;
        while(j<l)
        {
            b_sum+=cardPoints[j++];
        }
        ans=b_sum;
        System.out.println("b_sum --" + b_sum);
        j=l-k;
        while(i<k )
        {
            f_sum+=cardPoints[i];
             System.out.println("f_sum --" + f_sum);
            b_sum-=cardPoints[j+i];
             System.out.println("b_sum --" + b_sum);
            ans=Math.max(ans,f_sum+b_sum);
            i++;
        }
        return ans;
    }
}