class Solution {
    public int divide(int dividend, int divisor) {
        int sign = (dividend<0)^(divisor<0) ? -1 : 1, quotient = 0;
        if(dividend == Integer.MIN_VALUE){
            if(divisor == -1) return Integer.MAX_VALUE;
            if(divisor == Integer.MIN_VALUE) return 1;
            dividend += Math.abs(divisor);
            quotient++;
        }
        if(divisor == Integer.MIN_VALUE) return 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor); 
        while(dividend >= divisor){
            System.out.println("dvd before inner loop--" + dividend);
                   System.out.println("dvs before inner loop--" + divisor);
            int tmp = divisor, count = 1;
            while(dividend - tmp >= tmp){ 
                        
                tmp <<= 1;
                  System.out.println("temp in inner loop--" + tmp);
                count <<= 1;
                System.out.println("count in inner loop--" + count);
            }
            dividend -= tmp;
            quotient += count;
        }
        return sign * quotient;
    }
}