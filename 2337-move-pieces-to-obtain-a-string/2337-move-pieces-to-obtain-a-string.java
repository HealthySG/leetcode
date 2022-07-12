class Solution {
    public boolean canChange(String start, String target) {
        int i=start.length()-1,j=target.length()-1;
         boolean flag=true;
        char f[]=start.toCharArray();
        while(i>=0 && j>=0)
        {
           // System.out.println(i);
            if(f[i]==target.charAt(j))
            {
                i--;
                j--;
            }
            else if(f[i]=='_' && target.charAt(j)=='R')
            {
                int k=i;
                while(k>=0 && (f[k]!='R' && f[k]=='_'))
                {
                    k--;
                }
               if(k==-1)
                   return false;
               
                if(k>=0 && f[k]=='R')
                {
                    char temp=f[k];
               //     System.out.println(temp);
                    f[k]=f[i];
                    f[i]=temp;
                   
                }
              
                 i--;
                j--;
            }
            else if(f[i]=='L' && target.charAt(j)=='_')
            {
                 int k=i;
                while(k>=0 && f[k]!='_')
                {
                    k--;
                }
                if(k==-1)
                    return false;
                if(k>=0)
                {
                    char temp=f[k];
                   f[k]=f[i];
                   f[i]=temp;
                }
                  i--;
                j--;
            } 
            else
            {
                return false;
            }
           // System.out.println(Arrays.toString(f));
        }
       // if(!flag)
         //   return true;
        //else
            return true;
    }
}