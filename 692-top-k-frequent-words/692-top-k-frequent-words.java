class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer> tmap=new TreeMap<>();
         List<String> l=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            if(tmap.containsKey(words[i]))
            {
                tmap.put(words[i],tmap.get(words[i])+1);
            }
            else
            {
                tmap.put(words[i],1);
            }
        }
        
        /*TreeMap<String,Integer> sortedMap = new TreeMap<>(valueSort(tmap));*/
        Map<String,Integer> sortedMap=valueSort(tmap);
       // System.out.print("Map "+ sortedMap.toString());
        
        int i=0;
        for(Map.Entry<String,Integer> currentEntry :
             sortedMap.entrySet())
        {
            if(i<k)
                l.add(currentEntry.getKey());
            else
                break;
            i++;
        }
        return l;
    }
    
    public static <K, V extends Comparable<V> > Map<K, V> valueSort(Map<K, V> map)
{
	Comparator<K> valueComparator = new Comparator<K>()
	{
		public int compare(K k1, K k2)
		{
			int comp = map.get(k1).compareTo(map.get(k2));
			if (comp == 0)
			{
				int comp1 = ((String)k1).compareTo((String)k2);
				return comp1;
			}
			else
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