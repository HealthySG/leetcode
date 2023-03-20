class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int l=flowerbed.length;
        int i=0;
        if(l<n)
            return false;
        else if(l==1 && flowerbed[0]==1 && n==0)
            return true;
        else if(l==1 && flowerbed[0]==0 && n==1)
            return true;
        else if(l==1 && flowerbed[0]==0 && n>1)
            return false;
        else
        {
        while(i<l && n!=0)
        {
            if(i==0)
            {
                if(flowerbed[i]==0&&flowerbed[i+1]==0)
                {
                   flowerbed[i]=1;
                    n--;
                }
            }
            else if(i==l-1 && flowerbed[i]==0 && flowerbed[i-1]==0)
            {
                flowerbed[i]=1;
                n--;
            }
            
            else if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                 flowerbed[i]=1;
                n--;
            }
            i++;
        }
        }
       // System.out.println(Arrays.toString(flowerbed));
        if(n==0)
            return true;
        else
            return false;
    }
}