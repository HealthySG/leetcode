class Solution {
    public long maximumImportance(int n, int[][] roads) {
      /*  TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<roads.length;i++)
        {
           for(int j=0;j<roads[0].length;j++)
          {
                if(tm.containsKey(roads[i][j]))
                {
                    tm.put(roads[i][j],tm.get(roads[i][j])+1);
                }
                else
                {
                    tm.put(roads[i][j],1);
                }
           }
           
        }
        Map<Integer,Integer> sortedMap=valueSort(tm);
        Map<Integer,Integer> tMap=new HashMap<>();
        
         for(Map.Entry<Integer,Integer> currentEntry :
             sortedMap.entrySet())
        {
            
                tMap.put(currentEntry.getKey(),n--);
            
        }
        // System.out.print(tMap);
        long ans=0;
       // System.out.print(sortedMap);
         for(int i=0;i<roads.length;i++)
        {
             
           for(int j=0;j<roads[0].length;j++)
           {
               ans+=tMap.get(roads[i][j]);
           }
         }*/
        long ans = 0, x = 1;
		long degree[] = new long[n];
        for(int road[] : roads){
            degree[road[0]]++; 
			degree[road[1]]++;
        }
        Arrays.sort(degree);
        for(long i : degree) ans +=  i * (x++) ;
        return ans;
    
    }
public static <K, V extends Comparable<V> > Map<K, V> valueSort(Map<K, V> map)
{
	Comparator<K> valueComparator = new Comparator<K>()
	{
		public int compare(K k1, K k2)
		{
			int comp = map.get(k1).compareTo(map.get(k2));
			/*if (comp == 0)
			{
				int comp1 = ((String)k2).compareTo((String)k1);
				return comp1;
			}
            
			else*/
            {
                 comp=comp==1 ? -1 : 1;
                 return comp;
            }
				 
		}
	};

	// SortedMap created using the comparator
	Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
	sorted.putAll(map);
	return sorted;
}
}