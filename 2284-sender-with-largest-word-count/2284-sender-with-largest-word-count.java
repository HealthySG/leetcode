class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        for(int i=0;i<messages.length;i++)
        {
             String[] a=messages[i].split(" ");
            if(tm.containsKey(senders[i]))
            {
                tm.put(senders[i],tm.get(senders[i])+a.length);
            }
            else
            {
                tm.put(senders[i],a.length);
            }
            a=null;
        }
        Map<String,Integer> sortedMap=valueSort(tm);
         for(Map.Entry<String,Integer> currentEntry :
             sortedMap.entrySet())
        {
            
                return (currentEntry.getKey());
            
        }
        //System.out.print(sortedMap);
        return null;
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
				int comp1 = ((String)k2).compareTo((String)k1);
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