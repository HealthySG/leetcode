class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=blocks.length();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<l-k+1;i++)
        {
            int swap=0;
            for(int j=i;j<i+k;j++)
            {
                if(blocks.charAt(j)=='W')
                    swap++;
            }
            ans=Math.min(ans,swap);
        }
        return ans;
    }
}