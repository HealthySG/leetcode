class Solution {
    public String addStrings(String num1, String num2) {
        int l1=num1.length(),l2=num2.length();
        StringBuilder sb=new StringBuilder();
        int rem=0,f=0,g=0;
        int i1=l1-1,i2=l2-1;
        while(i1>=0 || i2>=0)
        { 
            f=0;g=0;
            if(i1>=0)
            {
             f=(num1.charAt(i1--)-'0');
            }
            if(i2>=0)
            {
             g=(num2.charAt(i2--)-'0');
            }
            sb.append((f+g+rem)%10);
            rem=(f+g+rem)/10;
        }
        if(rem!=0)
        sb.append(rem);
        return sb.reverse().toString();
    }
}