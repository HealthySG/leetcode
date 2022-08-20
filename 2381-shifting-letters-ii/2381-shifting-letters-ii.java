class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int l=s.length();
        int[] a=new int[l+1];
        for(int i=0;i<shifts.length;i++)
        {
            int start=shifts[i][0];
             int end=shifts[i][1];
            int ch=shifts[i][2];
            
            if(ch==1)
            {
               a[start]+=ch;
               a[end+1]-=ch; 
            }
            else
            {
              ch=-1;
               a[start]+=ch;
               a[end+1]-=ch; 
            }
        }
        System.out.println(Arrays.toString(a));
       String ans="";
        char vd='\u0000';
        int prefix=0;
        for(int i=0;i<l;i++)
        {
            prefix+=a[i];
            while(prefix<0)
                prefix+=26;
            int ch=(s.charAt(i)-'a'+prefix)%26;
            ans+=(char)(ch+'a');
        }
        return ans;
      //  return "";
    }
}
/*class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char arr[]=s.toCharArray();
        int n=s.length();
        int diff[]=new int[n+1];
        for(int shift[]:shifts){
            int a=shift[0];
            int b=shift[1];
            int d=shift[2]==1?1:-1;
            diff[a]+=d;
            diff[b+1]-=d;
        }
         System.out.println(Arrays.toString(diff));
        diff[0]%=26;
        for(int i=1;i<n+1;i++){
            diff[i]+=diff[i-1];
            diff[i]%=26;
        }
        for(int i=0;i<n;i++){
            int ind=arr[i]+diff[i];
            if(ind<97)
                ind+=26;
            if(ind>122)
                ind-=26;
            arr[i]=(char)ind;
        }
        return new String(arr);
        
    }
}
*/
