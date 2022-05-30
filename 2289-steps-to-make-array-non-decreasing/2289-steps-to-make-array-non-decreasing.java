class Solution {
    public int totalSteps(int[] nums) {
        int l=nums.length;
        Stack<Pair> st=new Stack<>();
        int ans=Integer.MIN_VALUE,c=0,i=0;
        st.push(new Pair(nums[l-1],0));
        
        for(i=l-2;i>=0;i--)
        {
           /* if(nums[i]>=nums[j] && nums[i-1]<=nums[i])
            {
                ans=Math.max(ans,(i-j)-1);
                if(ans==1)
                    count++;
                j=i;
            }      */
             c=0;
            if(nums[i]<=st.peek().ele)
            {
               
                st.push(new Pair(nums[i],c));
             // System.out.println(st);
            }
            else
            {
               while(!st.isEmpty() && st.peek().ele<nums[i])
               { 
                   c=Math.max(c+1,st.peek().i);
                   st.pop();
               }
                st.push(new Pair(nums[i],c));
               //     System.out.println(c);
                ans=Math.max(ans,c);
              // System.out.println(st);
            }
        }
       if(ans==Integer.MIN_VALUE)
           return 0;
        return ans;
    }
}
class Pair
{
    int ele;
    int i;
    Pair(int ele,int i)
    {
        this.ele=ele;
        this.i=i;
    }
}	
