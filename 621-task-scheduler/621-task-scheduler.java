class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] a=new int[26];
        int m=Integer.MIN_VALUE,sum=0;
        if(n==0)
            return tasks.length;
        else
        {
           // Arrays.sort(tasks);
            for(int i=0;i<tasks.length;i++)
            {
                a[tasks[i]-'A']++;
            }
            System.out.print(Arrays.toString(a));
            for(int i=0;i<a.length;i++)
            {
                if(m<a[i])
                {
                    m=a[i];
                }
                sum+=a[i];
            }
            if(m==1)
            {
                return sum;
            }
            else
            {
                Arrays.sort(a);
                //int rem=sum-m;
                //System.out.print(rem);
                m-=1;
                int need=(m*n);
                for (int i = 24; i >= 0; i--) {
			need -= Math.min((m), a[i]);
		}
                 //System.out.print(need);
                if(need<=0)
                {
                    return sum;
                }
                {
                 return sum+need;   
                }
            }
        }
        //return 0;
    }
}