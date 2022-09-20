class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
       /* Queue<Integer> q=new LinkedList<>();
        q.pop(low);*/
        String s="123456789";
        String k=Integer.toString(low);
        String k1=Integer.toString(high);
        int len=k.length();
        int len2=k1.length();
        List<Integer> lt=new ArrayList<>();
        for(int l=len;l<=len2;l++)
        {
           // for(int j=0;j<)
            int j=0,i=0;
            String ans="";
            while(j<=9-l)
            {
                ans=s.substring(j,j+l);
                int h=Integer.parseInt(ans);
                if(h>=low && h<=high)
                {
                    lt.add(h);
                 //   ans.removecharAt(i++);
                }
                j++;
            }
        }
        return lt;
    }
}