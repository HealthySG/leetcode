class Allocator {
 
    Map<Integer,List<Integer>> mp1=new HashMap<>();
    int[] a;
    int t;
    public Allocator(int n) {
        t=n;
        a=new int[n];
    }
    
    public int allocate(int size, int mID) {
         int freeSpaces = 0;
        for (int i = 0; i < a.length; i++) {
            //Check for consecutive freeSpaces
            if (a[i] == 0) {
                freeSpaces++;
            } else {
                freeSpaces = 0;
            }
            //if we found the consecutive freeSpaces then fill the mID's
            if (freeSpaces == size) {
                for (int j = i - size + 1; j <= i; j++) {
                    a[j] = mID;
                }
                return i - size + 1;
            }
        }
        return -1;
    }
    
    public int free(int mID) {
      int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == mID) {
                a[i] = 0;
                c++;
            }
        }
        return c;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.free(mID);
 */