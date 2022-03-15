class Solution {
    public boolean canReach(int[] arr, int start) {
        int l=arr.length;
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[l];
        q.add(start);
        vis[start]=true;
        while(!q.isEmpty())
        {
            for(int j=0;j<q.size();j++)
            {
                int i=q.remove();
                //System.out.println(i);
                if(arr[i]==0)
                {
                    return true;
                }
                if(i+arr[i]>=0 && i+arr[i]<l && vis[i+arr[i]]==false)
                {
                    
                  q.add(i+arr[i]);
                    vis[i+arr[i]]=true;
                }
                 if( i-arr[i]>=0 && i-arr[i]<l && vis[i-arr[i]]==false)
                 {
                   q.add(i-arr[i]);
                      vis[i-arr[i]]=true;
                 }
            }
        }
        return false;
    }
}