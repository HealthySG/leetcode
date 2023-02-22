class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int N=weights.length;
        int D=days;
          int low=Arrays.stream(weights).max().getAsInt();
        int min=Arrays.stream(weights).min().getAsInt();
        int  max=IntStream.of(weights).sum();
         int mid=0;
        if(N==1 && D>=1)
        {
            return min;
        }
        else if(D==1)
        {
            return max;
        }
        else
        {
        
            mid=bsearch(weights,low,max,N,D);
            return mid;
        }
        

    }
     int bsearch(int[] arr, int low, int max,int n,int D)
    {
         int mid=0,prev=0;
        while(low<max)
        {
            
             mid=low+(max-low)/2;
            int i=0,sum=0,days=1;
            
            while(i!=n)
            {
                
                if(sum+arr[i]<=mid)
                {
                    sum+=arr[i];
                    i++;
                }
                else
                {
                    sum=arr[i];
                    days++;
                    i++;
                }
            }
            if(days<=D)
            {
                max=mid;
            }
            else
            {
                
                low=mid+1;
            }
            System.out.println("LOW is---" + low);
            System.out.println("max is---" + max);
             System.out.println("mid is---" + mid);
            ////prev=mid;
        }
        
        return low;
    }

}