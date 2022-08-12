class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] a=new int[7];
     int[] b=new int[7];   
      int[] same=new int[7];        

     for(int i=0;i<tops.length;i++)
     {
           
           a[tops[i]]++;
            b[bottoms[i]]++;
           if(tops[i]==bottoms[i])
               same[tops[i]]++;
     }
       
        int ans=Integer.MAX_VALUE;
     for(int i=1;i<=6;i++)
     {
         if(a[i]+b[i]-same[i]==tops.length)
         {
             int temp=Math.min(a[i],b[i])-same[i];
             ans=Math.min(ans,temp);
         }
     }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}