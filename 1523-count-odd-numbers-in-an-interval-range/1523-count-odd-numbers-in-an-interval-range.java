class Solution {
    public int countOdds(int low, int high) {
        if(low==high)
            return low%2!=0?1:0;
        int ans=0;
        if((low&1)!=0 && (high&1)!=0)
            return (2+(high-low-1)/2);
        else if((high&1)==0 && (low&1)==0)
            return (high-low)/2;
        else if((high&1)==0 || (low&1)==0)
        {
            return (1+(high-low-1)/2);
        }
        return 0;
    }
}