class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
          HashMap<String, Integer> hm = new HashMap<>();
        return rec(0,0,dungeon,hm);
    }
    int rec(int i,int j,int[][] dungeon, HashMap<String, Integer> hm)
    {
        if(i>=dungeon.length || j>=dungeon[0].length)
            return Integer.MAX_VALUE;
                String key = i + "Codebix"  + j;
        if(hm.containsKey(key))
             return hm.get(key);
        int health=Math.min(rec(i+1,j,dungeon,hm),rec(i,j+1,dungeon,hm));
        int res=0;
        if(health==Integer.MAX_VALUE)
        {
            health=1;
        }
        if(health-dungeon[i][j]>0)
        {
            res=health-dungeon[i][j];
        }
        else
        {
            res=1;
        }
         hm.put(key, res);
        return res;
    }
}