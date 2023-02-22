class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int i=0;
        int l=s.length();
          while(i<l)
          {
            if(s.charAt(i)=='M')
            {
                 ans+=1000;
                i+=1;
            }
               
             else if(s.charAt(i)=='D')
             {
                   ans+=500;
                  i+=1;
             }
               
               else if(i+1<l && s.charAt(i)=='C' && s.charAt(i+1)=='M')
               {
                    ans+=900;
                    i+=2;
               }
                
               else if(i+1<l && s.charAt(i)=='C' && s.charAt(i+1)=='D')
               {
                 ans+=400;
                   i+=2;
               }   
              
              else if(s.charAt(i)=='C')
              {
                     ans+=100;
                    i+=1;
              }
              
              else if(s.charAt(i)=='L')
              {
                    ans+=50;
                  i+=1;
              }
               
              else if(i+1<l && s.charAt(i)=='X' && s.charAt(i+1)=='L')
              {
                    ans+=40;
                   i+=2;
              }
               
               else if(i+1<l && s.charAt(i)=='X' && s.charAt(i+1)=='C')
               {
                    ans+=90;
                    i+=2;
               }
                
               else if(s.charAt(i)=='X')
               {
                     ans+=10;
                   i+=1;
               }
               
              else if(s.charAt(i)=='V')
              {
                   ans+=5;
                  i+=1;
              }
                
               else if(i+1<l && s.charAt(i)=='I' && s.charAt(i+1)=='V')
               {
                      ans+=4;
                   i+=2;
               }
              
              else if(i+1<l && s.charAt(i)=='I' && s.charAt(i+1)=='X')
              {
                    ans+=9;
                  i+=2;
              }
               
              else if(s.charAt(i)=='I')
              {
                     ans+=1;
                  i+=1;
              }
              
              //i++;
          }
        return ans;
    }
}