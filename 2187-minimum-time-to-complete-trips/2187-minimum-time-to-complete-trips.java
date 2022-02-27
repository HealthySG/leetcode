class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long trips=0,n=time.length,ans=0;
        long low=time[0];
        long high = (long)totalTrips * (long)time[time.length-1];
        while(low<=high)
        {
            long tim=(low+high)>>1;
            if(isPossible(time,tim,n,totalTrips))
            {
                
               high=tim-1;
            }
            else
            {
                //ans=low;
                low=tim+1;
            }
            
        }
        return low;
    }
    boolean isPossible(int time[],long tim,long n,int totalTrips)
    {
                long trips=0;
                int i=0;
                while(i<n)
                {
                   trips+=tim/(long)time[i];
                    i++;
                }
                //tim++;
            
        if(trips>=totalTrips)
            return true;
        else
        {
            return false;
        }
    }
}