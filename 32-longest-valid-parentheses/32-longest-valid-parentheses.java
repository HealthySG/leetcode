class Solution {
    public int longestValidParentheses(String s) {
       if(s.equals(""))
           return 0;
        int l=s.length(),len=Integer.MIN_VALUE;
        int y=l;
        if(l==1)
            return 0;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<s.length();i++)
        {
            if(!st.isEmpty() && s.charAt(i)==')' && s.charAt(st.peek())=='(')
            {
                st.pop();
            }
            else
            {
            st.push(i); 
            }
        }
        System.out.println(st.toString());
        if(st.isEmpty())
            return l;
        while(!st.isEmpty())
        {
            
            len=Math.max(len,(l-1)-st.peek());
            l=st.pop();
        }
        System.out.println("l" +l);
        len=Math.max(len,l-0);
       /*if(len==0 && l==y-1)
       {
           return y-1;
       }
       */
            return len;
    }
}