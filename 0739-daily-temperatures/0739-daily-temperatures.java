class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Pair> st=new Stack<>();
        int j=n-2;
        st.push(new Pair(n-1,temperatures[n-1]));
        
        for(int i=n-2;i>=0;i--)
        {
            if(!st.isEmpty() && temperatures[i]<st.peek().val)
            {
                 //if(!st.isEmpty())
                    ans[j]=st.peek().ind-i;
            }
            else
            {
                while(!st.isEmpty() && st.peek().val<=temperatures[i])
                    st.pop();
                if(!st.isEmpty())
                    ans[j]=st.peek().ind-i;
            }
            st.push(new Pair(i,temperatures[i]));
            j--;
            // System.out.println("i-- "+ i);
            // while(!st.isEmpty())
            // {
            //     System.out.println(st.peek().val);
            //     st.pop();
            // }
        }
        return ans;
    }
}
class Pair 
{
    int ind;
    int val;
    Pair(int ind,int val)
    {
        this.ind=ind;
        this.val=val;
    }
    // public string toString(Object obj)
    // {
    //     System.out.println(Pair.ind +" "+ Pair.val);
    // }
}