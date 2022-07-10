class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
     /*   int n=buses.length,m=passengers.length;
        
            
        Arrays.sort(buses);
        int min=buses[n-2],max=buses[n-1];
         System.out.println("min  "+ min);
        Arrays.sort(passengers);
        if(n==1)
            return passengers[0]-1;
        int i=0,j=m-1,first=0;
        while(i<=j)
        {
            int mid=(i+j)>>1;
            // System.out.println("mid  "+ mid);
            if(passengers[mid]<=min)
            {
                first=mid;
                i=mid+1;
               //   System.out.println("i  "+ i);
            }
            else
            {
                j=mid-1;
                // System.out.println("j  "+ j);
            }
        }
        // System.out.println("first"+first);
      //  if(first!=0  && first!=m-1)
      //  {
           first++;
       // }
     /*   if(first==m-1 && (m-first+1)<=capacity)
            return passengers[m-1]+1;
        if(first==m-1)
        {
            return passengers[m-1]-1;
        }
         System.out.println("first"+first);*/
        /*
        return passengers[first]-1;*/
        Arrays.sort(buses);
        Arrays.sort(passengers);
        Set<Integer> set = new HashSet<>();
        int ans=0,j=0;
        for(int i=0;i<buses.length;i++){
            int c = 0;
            while(j<passengers.length && c<capacity && passengers[j]<=buses[i]){
                if(!set.contains(passengers[j]-1)){
                    ans=passengers[j]-1;
                }
                set.add(passengers[j]);
                j++; c++;
            }
            if(c<capacity && !set.contains(buses[i])){
                ans = buses[i];
            }
        }
        return ans;
    }
}