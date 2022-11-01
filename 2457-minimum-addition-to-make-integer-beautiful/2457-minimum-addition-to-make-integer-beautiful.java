class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long temp=n;
        long sum=0;
        long dig=0;
        long c=0;
        long base=1;
        // if(sum<=target)
        //     return 0;
        while(sum(n)>target)
        {
            n=n/10+1;
            base*=10;
        }
       
           // System.out.println((dig+1)*(int)Math.pow(10,(c-1)));
            return n*base-temp;
        
        //return 0L;
    }
    long sum(long n)
    {
        long dig=0,sum=0;
         while(n!=0)
        {
            dig=n%10;
            sum+=dig;
           // c++;
            n/=10;
            
        }
        return sum;
    }
}