class Solution {
    public int nextGreaterElement(int n) {
        if(n>=Integer.MAX_VALUE)
            return -1;
        //int lo=Integer.parseInt(n);
        String s=n+"";
        int left=0;
        char[] dm=s.toCharArray();
        for(int i=dm.length-1;i>0;i--)
        {
            if(dm[i]-'0'>dm[i-1]-'0')
            {
                  left=i;
                break;
            }
              
        }
        if(left==0)
            return -1;
        else 
        {
            int swap1val=dm[left-1];
          //  int swap2val=Integer.MIN_VALUE;
            int swap2ind=Integer.MIN_VALUE;
            for(int i=dm.length-1;i>=0;i--)
            {
                if(dm[i]-'0'>swap1val-'0')
                {
                      swap2ind=i;break;
                }
                   
            }
             System.out.println(swap2ind+" "+ left);
            swap(dm,left-1,swap2ind);
            
             reverseSuffix(dm,left);
             String ans="";
             for(char c:dm )
                 ans+=c;
            System.out.println(ans);
            //int g= (ans)-'0';
            long m = Long.parseLong(new String(ans));
            if(m>Integer.MAX_VALUE)
                return -1;
            else
                return (int)m;
           //
            //return g;
        }
    //   return 0;
       /* StringString.valueOf(n);
        char[] */
        //System.out.prin
    }
    void swap(char[] dm,int swap1ind,int swap2ind)
    {
        char temp=dm[swap1ind];
        dm[swap1ind]=dm[swap2ind];
        dm[swap2ind]=temp;
    }
     void reverseSuffix(char[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}