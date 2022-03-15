class Solution {
    public int minAddToMakeValid(String s) {
        int l=s.length();
        ArrayDeque<Character> dq=new ArrayDeque<>();
        for(int i=0;i<l;i++)
        {
            if(!dq.isEmpty()  && s.charAt(i)==')' && dq.peek()=='(')
                dq.pop();
            else
                dq.push(s.charAt(i));
                
        }
        
        return dq.size();
    }
}