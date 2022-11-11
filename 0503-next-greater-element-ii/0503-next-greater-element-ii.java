class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            if(nums[st.peek()]>nums[i])
                ans[i]=nums[st.peek()];
            else
            {
                while(!st.isEmpty() && nums[st.peek()]<nums[i])
                    st.pop();
                if(!st.isEmpty())
                    ans[i]=nums[st.peek()];
                else
                    ans[i]=-1;
            }
            st.push(i);
        }
     //   System.out.println(st);
        for(int i=n-1;i>=0;i--)
        {
            if(nums[st.peek()]>nums[i])
                ans[i]=nums[st.peek()];
            else
            {
                while(!st.isEmpty() && nums[st.peek()]<=nums[i])
                    st.pop();
                if(!st.isEmpty())
                    ans[i]=nums[st.peek()];
                else
                    ans[i]=-1;
            }
            st.push(i);
         //     System.out.println(st);
        }
       // System.out.println(st);(Arrays.toString(ans));
        
        return ans;
    }
}