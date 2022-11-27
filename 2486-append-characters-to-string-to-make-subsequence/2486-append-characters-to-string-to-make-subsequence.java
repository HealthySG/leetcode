class Solution {
    public int appendCharacters(String s, String t) {
        int l1=s.length();
         int l2=t.length();
        int j=0;
         for(int i=0;i<l1;)
         {
             if(j<l2 && s.charAt(i)==t.charAt(j))
             {
                 i++;
                 j++;
             }
             else
             {
                 i++;
             }
         }
          System.out.println(j);
         return l2-j;
        // Integer[][] dp=new Integer[l1][l2];
        // return rec(s,t,0,0);
        
    }
    // int rec(String s, String t,int i,int j)
    // {
    //     if(i==s.length() || j==t.length())
    //         return 0;
    //     if(s.charAt(i)==t.charAt(j))
    //     {
    //         return 1+rec(s,t,i+1,j+1);
    //     }
    //     else
    //     {
    //         return Math.max(rec(s,t,i+1,j),rec(s,t,i,j+1));
    //     }
    // }
}