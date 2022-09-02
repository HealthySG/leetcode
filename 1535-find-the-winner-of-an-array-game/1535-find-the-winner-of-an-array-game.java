class Solution {
    public int getWinner(int[] arr, int k) {
        int l=arr.length;
        /*int l=arr.length,max=Integer.MIN_VALUE,ans=-1;
        Stack<Integer> st=new Stack<>();
        st.push(arr[l-1]);
        max=Math.max(max,arr[l-1]);
        for(int i=l-2;i>0;i--)
        {
            max=Math.max(max,arr[i]);
            if(!st.isEmpty() && st.peek()>arr[i])
            {
                while(!st.isEmpty())
                {
                    st.pop();
                }
               // st.pop(); 
                 st.push(arr[i]);
            }
            else
            {
                st.push(arr[i]);
            }
            if(!st.isEmpty() && st.size()>k)
            {
                ans=st.peek();
            }
            System.out.println(ans);
        }
        max=Math.max(max,arr[0]);
        if(st.isEmpty() || ans==-1)
        {
            return max;
        }
        else
        {
            return ans;
        }*/
        int curr=arr[0],count=0;
        for(int i=1;i<l;i++)
        {
            if(curr<arr[i])
            {
                curr=arr[i];
                count=0;
            }
           if (++count == k) break;
        }
        return curr;
    }
}