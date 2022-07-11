class Solution {
    public String reverseWords(String s) {
               Stack<StringBuilder> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                sb.append(s.charAt(i));
            }
            if((s.charAt(i)==' ' || i==s.length()-1) && sb.length() !=0)
            {
                st.push(new StringBuilder(sb));
                sb.setLength(0);
         
            }
        }
        String output="";
        while(!st.empty())
        {
        	output=output+" "+st.pop();
        }
      //  System.out.println(output.trim());
        
        return output.trim();
    }
}