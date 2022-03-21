class Solution {
    public int countCollisions(String directions) {
        int l=directions.length();
        int ans=0;
        Stack<Character> s=new Stack<>();
        s.push(directions.charAt(0));
        for(int i=1;i<l;i++)
        {
            char curr=directions.charAt(i);
            if(curr=='L' && s.peek()=='R')
            {
                ans+=2;
               // System.out.println(ans);
                s.pop();
                curr='S';
            }
            else if(curr=='L' && s.peek()=='S')
            {
                // s.pop();
                ans+=1;
               // System.out.println(ans);
               
                curr='S';
            }
            while(!s.isEmpty() && ((s.peek() == 'R' && curr == 'S') )){
                ans+=1;
              s.pop();
            }
            s.push(curr);
        }
        return ans;
    }
}