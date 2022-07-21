class Solution {
    public boolean isPerfectSquare(int num) {
      /*  int result=1,ans=0,i=1;
       while(result<=num)
       {
           i++;
          result=i*i;
         
       }
      if(result==num)
          return true;
        return false;*/
       double sqrt=Math.sqrt(num);   
        return ((sqrt - Math.floor(sqrt)) == 0);   
       
    }
}