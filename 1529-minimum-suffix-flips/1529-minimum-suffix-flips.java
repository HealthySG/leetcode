class Solution {
    public int minFlips(String target) {
        char[] q=target.toCharArray();
        int ind=-1;
        for(int i=0;i<q.length;i++)
        {
            if(q[i]=='1')
            {
               ind=i;
               break;
            } 
        }
        if(ind==-1)
            return 0;
        int ans=q.length-ind;
        for(int i=ind;i<q.length-1;i++)
        {
            if(q[i]==q[i+1])
                ans--;
        }
        return ans;
    }
}