class RandomizedSet {
    List<Integer> lt;
    Map<Integer,Integer> mp;
    static int idx=0;
    public RandomizedSet() {
        lt=new ArrayList<>();
        mp=new HashMap<>();
    }
    
    public boolean insert(int val) {
       if(mp.containsKey(val))
           return false;
        lt.add(val);
        mp.put(val,lt.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(mp.containsKey(val)==false)
            return false;
        int ind=mp.get(val);
        Collections.swap(lt,ind,lt.size()-1);
        int swapped=lt.get(ind);
        mp.put(swapped,ind);
        lt.remove(lt.size()-1);
        mp.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rm=new Random();
        int n=rm.nextInt(lt.size());
        return lt.get(n);
//         int currentIndex=0;
        
//         for (Integer element :st) { 
//             if (currentIndex == randomIndex)
//             {
//                return element;
//             }
//             currentIndex++;
//         }
//         return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */