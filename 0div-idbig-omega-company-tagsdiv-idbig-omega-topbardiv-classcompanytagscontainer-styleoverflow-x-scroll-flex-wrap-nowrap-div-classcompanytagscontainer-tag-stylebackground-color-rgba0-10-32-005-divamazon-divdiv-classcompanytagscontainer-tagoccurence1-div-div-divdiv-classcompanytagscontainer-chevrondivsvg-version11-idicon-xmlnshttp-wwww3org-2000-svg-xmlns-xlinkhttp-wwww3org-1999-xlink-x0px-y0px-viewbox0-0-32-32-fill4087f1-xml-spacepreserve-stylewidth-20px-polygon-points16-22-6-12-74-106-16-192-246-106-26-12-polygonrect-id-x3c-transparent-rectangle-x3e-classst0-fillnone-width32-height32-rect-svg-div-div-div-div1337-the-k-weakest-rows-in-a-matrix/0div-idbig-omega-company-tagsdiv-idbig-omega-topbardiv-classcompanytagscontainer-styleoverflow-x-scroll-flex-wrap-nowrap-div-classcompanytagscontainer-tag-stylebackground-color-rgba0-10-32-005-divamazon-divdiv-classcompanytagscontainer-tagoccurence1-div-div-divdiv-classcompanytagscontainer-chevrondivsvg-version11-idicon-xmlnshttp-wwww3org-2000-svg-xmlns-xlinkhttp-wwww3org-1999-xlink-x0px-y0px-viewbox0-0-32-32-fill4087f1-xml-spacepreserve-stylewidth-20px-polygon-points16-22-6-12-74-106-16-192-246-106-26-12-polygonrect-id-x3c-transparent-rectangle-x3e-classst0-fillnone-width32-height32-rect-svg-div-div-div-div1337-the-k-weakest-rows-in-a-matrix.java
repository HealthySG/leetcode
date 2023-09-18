class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] res=new int[mat.length][2];
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            res[i][0]=i;
            res[i][1]=count;
        }
        Arrays.sort(res,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[1]==b[1]){
                    return a[0]-b[0];
                }
                return a[1]-b[1];
            }
        });
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=res[i][0];
        }
        return ans;
    }
}