class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        System.out.println(Arrays.deepToString(points));
        int shoot=points[0][1];
        int ans=1;
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]>shoot)
            {
                 ans++;
                  shoot=points[i][1];
             //   System.out.println(shoot);
            }
               
        }
      /*  Stack<Pair> st=new Stack<>();
       */
        return ans;
    }
}
/*class Pair
{
    int i;
    int j;
    Pair(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}*/