class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis=new boolean[rooms.size()];
      int i=0;
        rec(0,vis,rooms);
         while(i<rooms.size())
        {
            if(!vis[i])
                return false;
            i++;
        }
          return true;
      /*  for(i=0;i<rooms.size();i++)
        {
            if(i==0)
               vis[i]=true; 
            for(int j=0;j<rooms.get(i).size();j++)
            {
                if(rooms.get(i).get(j)!=i)
                    vis[rooms.get(i).get(j)]=true;
                
                
            }
        }
        System.out.println(Arrays.toString(vis));
        i=0;
        while(i<rooms.size())
        {
            if(!vis[i])
                return false;
            i++;
        }
        return true;
        */
    }
    void rec(int i,boolean[] vis,List<List<Integer>> rooms)
    {
        vis[i]=true;
         for(int j=0;j<rooms.get(i).size();j++)
         {
             if(vis[rooms.get(i).get(j)]!=true)
                rec(rooms.get(i).get(j),vis,rooms);
         }
    }
}