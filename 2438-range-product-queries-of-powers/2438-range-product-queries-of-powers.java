class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod=1000000007;
      //  int[] binaryNum = new int[32];
         List<Integer> lt=new ArrayList<>();
      //z  int i = 31;
        while (n > 0) {
           lt.add(n % 2);
            n = n / 2;
           // i--;
        }
        
      //  System.out.println(Arrays.toString(binaryNum));
                List<Integer> a=new ArrayList<>();
      //   List<Integer> a=new ArrayList<>();
        int[] u=new int[queries.length];
        int j=0;
        for(int i=0;i<lt.size();i++)
        {
            if(lt.get(i)==1)
            {
                a.add((int)Math.pow(2,j));
              
            }
              j++;
        }
        //int[] a=new int[n]

        // int sum=0;
        // while(sum!=n && sum<n)
        // {
        //     a.add((int)Math.pow(2,i));
        //     sum+=(int)Math.pow(2,i);
        //     i++;
        // }
        for(int i=0;i<queries.length;i++)
        {
            int start=queries[i][0];
            int end=queries[i][1];
            int pro=1;
            for( j=start;j<=end;j++)
            {
                pro=(int)(((long)pro*(long)a.get(j))%(long)mod);
            }
            u[i]=pro;
        }
        
        //System.out.println(a);
        return u;
    }
}