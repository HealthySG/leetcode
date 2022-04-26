class Solution {
    public boolean validPalindrome(String s) {
        /* int i=0,j=s.length()-1,c=0,temp1=0,temp2=0;
        boolean flag=false;
        if(s.length()==2)
        {
            if(s.charAt(0)==s.charAt(1))
                return true;
        }
        else if(s.length()==1)
            return true;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
               // System.out.println("i+ j" +i);
                j--;
                // System.out.println("i+ j" +j);
            }
            else if(s.charAt(i)!=s.charAt(j) && c==0)
            {
                temp1=i;temp2=j;
                if(s.charAt(++temp1)==s.charAt(j))
                    i++;
                else
                    j--;
              //  System.out.println("i+ j" +i);
                c++;
               // System.out.println("i+ j" +j);
            }
             else if(s.charAt(i)!=s.charAt(j) && c!=0)
            {
                 flag=true;
                 break;
            }
            
        }
        if(s.length()==3 && c==1)
        {
            flag=true;
        }
        if(flag==true)
            return false;
        else
            return true;*/
         int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++; j--;
        }

        if (i >= j) return true;

        if (isPalin(s, i + 1, j) || isPalin(s, i, j - 1)) return true;
        return false;
    }

    private boolean isPalin(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++; j--;
            }
            else return false;
        }
        return true;
    }
}