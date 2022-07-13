class Solution {
    public int getSum(int a, int b) {
       int c; 
      while(b !=0 ) {
        c = (a&b);
        System.out.println("C is"+ c);
        a = a ^ b;
        System.out.println("A is"+ a);  
        b = (c)<<1;
        System.out.println("b is"+ b);
      }
      return a; 
    }
}