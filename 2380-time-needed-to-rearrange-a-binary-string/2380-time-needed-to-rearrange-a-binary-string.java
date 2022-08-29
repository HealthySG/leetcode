class Solution {
    public int secondsToRemoveOccurrences(String s) {
       /* int one=0,zero=0;
        int first=-1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                if(first==-1)
                    first=i;
                one++;
            }
        }
        return first-one+1;*/
        if(s.indexOf("01") == -1) return 0;
        s = s.replaceAll("01", "10");
        return 1 + secondsToRemoveOccurrences(s);
    }
}