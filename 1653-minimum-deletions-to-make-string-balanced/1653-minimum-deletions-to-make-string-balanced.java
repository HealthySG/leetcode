class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
       /* int i=0,j=n-1;
        System.out.println(j);
        while(i<n && s.charAt(i)=='a')
        {
            i++;
        }
        while(j>0 && s.charAt(j)=='b')
        {
            j--;
        }
        System.out.println(i);
        System.out.println(j);
        int c1=0,c2=0;
        for(int k=i;k<=j;k++)
        {
            if(s.charAt(k)=='a')
                c1++;
            else
                c2++;
        }
        //System.out.println(c1);
        System.out.println(c2);
        int n=s.length();
        */
    int ans=0;
    int count_b=0;
    for(int i=0;i<n;i++)
    {
        if (s.charAt(i)=='b') count_b++;
        else
        {
            ans=Math.min(ans+1,count_b);
        }
    }
    return ans;
    
      //  return Math.min(c1,c2);
    }
}