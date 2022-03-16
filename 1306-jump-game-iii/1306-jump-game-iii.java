class Solution {
    public boolean canReach(int[] arr, int start) {
        int l=arr.length;
        boolean[] vis=new boolean[l];
      /*  Queue<Integer> q=new LinkedList<>();
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
        */
        vis[start]=true;
        return rec(start,arr,vis,l);
    }
    boolean rec(int i,int arr[],boolean[] vis,int l)
    {
         boolean left=false;
        boolean right=false;
         System.out.println("i and arr[i] "+i+" "+arr[i]);
         if(arr[i]==0)
          {
             System.out.println("righ result "+i);
             return true;
          }
        if( i-arr[i]>=0 && i-arr[i]<l && vis[i-arr[i]]==false)
         {
             vis[i-arr[i]]=true;
              left= rec(i-arr[i],arr,vis,l);
         }
        if(i+arr[i]>=0 && i+arr[i]<l && vis[i+arr[i]]==false)
        {
            vis[i+arr[i]]=true;
             right= rec(i+arr[i],arr,vis,l);
            
        }
         
         return left || right;
    }
}