class Solution {
    public int minSteps(int n) {
        if(n==1)
            return 0;
        else
            return 1+help(n,1,1);
        //return 0;
    }
    int help(int n,int m,int clip)
    {
        if(m==n)
            return 0;
        if(m>n)
            return -1;
        if(m == clip) {
            int op2=help(n,m+clip,clip);
            return op2 == -1 ? -1 : 1 + op2;
        }
       int op1=help(n,m,m);
       int op2=help(n,m+clip,clip);
         if(op1 == -1 && op2 == -1) {
            return -1;
        }
        else if(op1 == -1) {
            return 1 + op2;
        }
        else if(op2 == -1) {
            return 1 + op1;
        }
        else {
           return 1+Math.min(op1,op2);  
        }
       
    }
}