class DataStream {
    int val;
    int K;
    int prev=-1;
    int c;
    public DataStream(int value, int k) {
        val=value;
        K=k;
    }
    public boolean consec(int num) {
        if(num==val && c+1>=K)
        {  
           c++;
            return true; 
        }
         
        else if(num==val)
        {
            c++;
        }
        else{
            //prev=num;
            c=0;
        }
         return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */