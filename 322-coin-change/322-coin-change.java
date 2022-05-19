class Solution {
  
    public int coinChange(int[] coins, int amount) {
      //  return help(coins,amount);
   /* int help(int[] coins,int amount)
    {
        System.out.println("amount is " + amount);
        if(amount==0)
            return 0;
        if(amount<0)
            return Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i:coins)
        {
            if(i<=amount)
            {
             int subans=help(coins,amount-i);
               // if(subans==)
            System.out.println("subans is " + subans);
             if(subans!=Integer.MAX_VALUE && subans+1<ans)
             {
                 ans=subans+1;
                 
             }
              
            }
        }
       //   System.out.println("ans is " + ans);
        return  (ans==Integer.MAX_VALUE || ans==0)?-1:ans;*/
    if(coins == null || coins.length == 0 || amount < 1) return 0;

    Deque<Integer> queue = new ArrayDeque<Integer>();
    Set<Integer> visited = new HashSet<Integer>();
    queue.addFirst(amount);
    visited.add(amount);
    int level = 0;

    while(!queue.isEmpty()){
      int size = queue.size();

      while(size-- > 0){
        int curr = queue.removeLast();
        if(curr == 0) return level;

        if(curr < 0) continue;

        for(int coin : coins){
          int next = curr - coin;
          if(next >= 0 && !visited.contains(next)){
            queue.addFirst(next);
            visited.add(next);
          }
        }
      }

      level++;
     //System.out.println("level is " + level);
    }

    return -1;
  }
   
    
}

