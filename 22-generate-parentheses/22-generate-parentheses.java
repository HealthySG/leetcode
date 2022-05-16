class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> l=new ArrayList<>();
         char[] a=new char[2*n];
         help(l,0,0,0,n,a);
        return l;
    }
    void help(List<String> l,int c,int o,int idx,int n,char[] a)
    {
        if(idx==2*n)
        {
           // System.out.println(Arrays.toString(a));
            l.add(String.valueOf(a));
            return;
        }
        if(o<n)
        {
            a[idx]='(';
            help(l,c,o+1,idx+1,n,a);
        }
        if(c<o)
        {
             a[idx]=')';
              help(l,c+1,o,idx+1,n,a);
        }
    }
}