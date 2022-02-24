class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1,ans=0;
        int max=Arrays.stream(piles).max().getAsInt();
        
        while(min<=max)
        {
            int mid=(min+max)>>1;
           // System.out.println("MID is   " +mid);
            if(check(piles,mid,h))
            {
                ans=mid;
                max=mid-1;
               //  System.out.println("MAX is   " +max);
            }
            else
            {
                
                min=mid+1;
               // System.out.println("MIN is   " +min);
            }
        }
        return ans;
    }
    boolean check(int[] piles,int mid,int h)
    {
        int time=0;
        for(int i=0;i<piles.length;i++)
        {
            if((piles[i]%mid)!=0)
                time+=(piles[i]/mid)+1;
            else
                time+=piles[i]/mid;
        }
        if(time<=h)
            return true;
        else 
            return false;
    }
}