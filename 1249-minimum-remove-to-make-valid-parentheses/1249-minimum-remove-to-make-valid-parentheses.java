class Solution {
    public String minRemoveToMakeValid(String s) {
        int l=s.length();
    //    int i=0,j=0;
        StringBuilder ans=new StringBuilder(s);
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='(')
                st.push(i);
            else if(s.charAt(i)==')')
            {
                if(st.size()>0 && s.charAt(st.peek())=='(')
                {
                    st.pop();
                }
                else
                {
                   st.push(i); 
                }
            }
        }
        while(st.size()>0)
        {
            
            ans.deleteCharAt(st.pop());
            
        }
        return ans.toString();
    }
}