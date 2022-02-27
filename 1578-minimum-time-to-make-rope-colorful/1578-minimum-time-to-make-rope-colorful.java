class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] a=colors.toCharArray();
        int time=0;
        int prev=0;
        int n=colors.length();
        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[prev])
            {
                prev=i;
            }
            else
            {
                if(neededTime[prev]<neededTime[i])
                {
                    time+=neededTime[prev];
                    prev=i;
                }
                else
                {
                    time+=neededTime[i];
                   // prev=i;
                }
            }
       /*     if(colors.charAt(i)==colors.charAt(i+1))
            {
                if(neededTime[i]>neededTime[i+1])
                {
                    time+=neededTime[i+1];
                    i+=2;
                }
                else
                {
                     time+=Math.min(neededTime[i],neededTime[i+1]);
                     i+=2;
                }
               
            }
            else if(i>0 && colors.charAt(i)==colors.charAt(i-1))
            {
                 if(neededTime[i]>neededTime[i-1])
                {
                    time+=neededTime[i];
                    i+=1;
                }
                else   
                {
                    time+=neededTime[i-1];
                    i+=2;
                }
            }
        }
        */
        
        }
        return time;
    }
}