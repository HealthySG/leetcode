class Solution {
    public int countTime(String time) {
        int ans=1;
        if(time.charAt(0)=='?' && time.charAt(1)=='?' && time.charAt(3)=='?' && time.charAt(4)=='?')
        {
           return 1440;
        }
         if(time.charAt(0)=='?' && time.charAt(1)=='?')
             ans=24;
        else if(time.charAt(0)=='?' && time.charAt(1)<='3')
         {
             ans=3;
         }
         else if(time.charAt(0)=='?' && time.charAt(1)>'3')
         {
             ans=2;
         }
         if(time.charAt(1)=='?' && time.charAt(0)<='1')
         {
             ans*=10;
         }
         else if(time.charAt(1)=='?' && time.charAt(0)=='2')
             ans*=4;
         if(time.charAt(3)=='?')
         {
               ans*=6;
         }
          if(time.charAt(4)=='?')
         {
               ans*=10;
         }
        return ans;
    }
}