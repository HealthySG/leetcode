class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
    /*    Arrays.sort(tiles,(a,b)->a[0]-b[0]);
        int n=tiles.length,right=0,sum=0,end=0,ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            end=tiles[i][0]+carpetLen-1;
            while(right<n && tiles[right][1]<end)
            {
                sum+=tiles[right][1]-tiles[right][0]+1;
             //   System.out.println("SUM IS "+ sum);
                right++;
             //   System.out.println("right IS "+ right);
            }
            if(right==n || tiles[right][0]>end)
            {
                ans=Math.max(ans,sum);
            }
            else
            {
                 System.out.println("SUM IS "+ (sum+(end-tiles[right][0]+1)));
                ans=Math.max(ans,sum+end-tiles[right][0]+1);
            }
            sum=sum-tiles[i][1]-tiles[i][0]+1;
        }
        return ans;*/
            Arrays.sort(tiles, (a,b)->a[0]-b[0]);
       
        int max = 0;
        int j  = 0;
        int val = 0;
        for(int i=0; i<tiles.length; i++) {
            int fin = tiles[i][0] + carpetLen;
            
            while (j < tiles.length && fin > tiles[j][1] ) {
                val += (tiles[j][1] - tiles[j][0] + 1);
                j++;
            }
            if (j < tiles.length) {
                max = Math.max(max, val + Math.max(fin-tiles[j][0], 0));
            }
            max = Math.max(max, val);
            val -= (tiles[i][1] - tiles[i][0] +1);
        }
    
        return max;
    }
    
}