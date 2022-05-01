class Solution {
    public String removeDigit(String number, char digit) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<number.length()-1;i++)
        {
            if(number.charAt(i)==digit && number.charAt(i)-'0'<number.charAt(i+1)-'0')
            {
                ans=i;
                break;
            }
            else if(number.charAt(i)==digit && number.charAt(i)-'0'>number.charAt(i+1)-'0')
            {
                
                ans=Math.max(ans,i);
            }
        }
        if(number.charAt(number.length()-1)==digit && (ans==Integer.MIN_VALUE ||(number.charAt(ans)-'0'>number.charAt(ans+1)-'0')))
            // 
            ans=Math.max(ans,number.length()-1);
        StringBuilder sb = new StringBuilder(number);
        sb.deleteCharAt(ans);
        return sb.toString();
    }
}