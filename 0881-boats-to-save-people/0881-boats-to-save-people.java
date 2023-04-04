class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=people.length;
        int ans=0;
        int i=0,j=l-1;
        while(i<l && j>0 && i<j)
        {
            if(people[i]+people[j]<=limit)
            {
                ans+=1;
                i++;
                j--;
            }
            else if( people[i]+people[j]>limit)
            {
                j--;
            }
        }
      //  System.out.println(ans);
        return ans+(l-2*ans);
       /* for(int i=0;i<people.length;)
        {
            if(i+1<people.length && people[i]+people[i+1]<=limit)
            {
                ans++;
                i+=2;
            }
            else
            {
                ans++;
                i+=1;
            }
        }
        
        return ans;*/
    }
}