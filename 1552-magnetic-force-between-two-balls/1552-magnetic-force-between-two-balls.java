class Solution {
    public int maxDistance(int[] position, int m) {
        int len=position.length;
        int max=Arrays.stream(position).max().getAsInt();
        Arrays.sort(position);
        int l=1,mid=0,res=0;
        int h=position[len-1]-position[0];
        while(l<=h)
        {
            mid=(l+(h))>>1;
        //   System.out.println("Mid is " + mid);
            if(ispossible(position,mid,m,l,h,max,len))
            {
                res=mid;
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return res;
    }
    boolean ispossible(int[] position,int mid,int m,int l,int h,int max,int len)
    {
        int grp=1,i=position[0];
        for(int j=1;j<len;j++)
        {
            if((position[j]-i)>=mid)
            {
                grp++;
                i=position[j];
            }
            
        }
        if(grp>=m)
        {
            return true;
        }
        return false;
    }
}