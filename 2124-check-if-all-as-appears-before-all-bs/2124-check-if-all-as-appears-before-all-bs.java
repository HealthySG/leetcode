class Solution {
    public boolean checkString(String s) {
         int n=s.length();
        int i=0,j=n-1;
        while(i<n-1)
        {
            if(s.charAt(i)=='b' && s.charAt(i+1)=='a')
                return false;
            i++;
        }
       /* while(i<n && s.charAt(i)=='a')
        {
            i++;
        }
        while(j>0 && s.charAt(j)=='b')
        {
            j--;
        }
        j+=1;
        i-=1;
        if(((j-i))==1)
            return true;
        else if(i==n-1)
            return true;
        else if(j==n-1)
            return true;
        else
            return false;
            */
        return true;
     
    }
}