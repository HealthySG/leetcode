class Solution {
    public int maximumGroups(int[] grades) {
      /*  long n=grades.length;
        long l=0,r=n;
        long ans=0;
        while(l<=r)
        {
            System.out.println("l and in loop "+l+" "+r);
            long mid=(l+(r-l))>>1;
            if((mid*(mid+1))/2<=n)
            {
                ans=mid;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
                
        }
      /*  Arrays.sort(grades);
        int j=0;
        int currsum=grades[n-1];
        int ans=1,i=n-2,sum=0;
        while(i>j)
        {
            sum=0;
            sum+=grades[i];
            while(j<i && currsum>sum){
                sum+=grades[j++];
            }
            if(currsum<sum)
                ans++;
            currsum=sum;
            i--;
        }*/
       /*  return (int)ans;*/
              int left = 0, right = 1000, n = grades.length;
        while (left < right) {
            int k = (left + right + 1) / 2;
            if (k * (k + 1) / 2 > n) {
                right = k - 1;
            } else {
                left = k;
            }
        }
        return left; 
    }
}