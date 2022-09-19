class FreqStack {
    Map<Integer,Integer> mp=null;
    List<Stack<Integer>> lt=null;
    public FreqStack() {
        mp=new HashMap<>(); 
        lt=new ArrayList<>();
    }
    
    public void push(int val) {
        mp.put(val,mp.getOrDefault(val,0)+1);
        int freq=mp.get(val);
        if(freq-1>=lt.size())
            lt.add(new Stack<Integer>());
        (lt.get(freq-1)).add(val);
        
    }
    
    public int pop() {
        int len=lt.size();
        int x=lt.get(len-1).pop();
        if(lt.get(len-1).empty())
            lt.remove((len-1));
        mp.put(x,mp.get(x)-1);
        if(mp.get(x)==0)
            mp.remove(x);
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */