class Solution {
    public int twoCitySchedCost(int[][] costs) {
       Arrays.sort(costs,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
	   int sum=0;
	   for(int i=0;i<costs.length/2;i++)
	   {
		   sum+=costs[i][0];
	   }
	   for(int i=(costs.length/2);i<costs.length;i++)
	   {
		   sum+=costs[i][1];
	   }
        return sum;
    }
   // public int compare(int[] a,int[] b)
}