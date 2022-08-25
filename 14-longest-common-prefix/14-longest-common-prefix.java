class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
    //    System.out.println(Arrays.toString(strs));
        if(strs.length==0)
            return "";
        int c=0;
        
        String a=strs[0];
        int l=a.length();
        String b=strs[strs.length-1];
        while(c<l)
        {
            if(a.charAt(c)==b.charAt(c))
            c++;
            else
                break;
        }
      return c == 0 ? "":a.substring(0, c);
    }
}