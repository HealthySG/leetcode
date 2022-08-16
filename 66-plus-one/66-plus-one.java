class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int carry=0,a=0;
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)
            {
                 a=(digits[i]+1)+carry;
               //  System.out.println(a);
            }
              
            else
            {
                  a=digits[i]+carry;
               //  System.out.println(a);
            }
              
            carry=(a/10);
            digits[i]=a%10;
        }
        
        
        if(carry!=0)
        {
            int temp[]=new int[n+1];
            temp[0]=carry;
            for(int i=1;i<=n;i++)
            {
                temp[i]=digits[i-1];
                
            }
            return temp;
        }
          
       return digits;
    }
}