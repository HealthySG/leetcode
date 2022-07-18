class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
         int pair[][] = new int[difficulty.length][2];
        for(int i = 0; i < difficulty.length; i++)
        {
            pair[i][0] = difficulty[i];
            pair[i][1] = profit[i];
        }
        /* Arrays.sort(pair, new Comparator<int[]>() {
        public int compare(int o1[], int o2[]){
            return Integer.valueOf(o1[0]).compareTo(o2[0]);
        }
    });*/
      Arrays.sort(pair,(int o1[], int o2[]) -> {
           return Integer.valueOf(o1[0]).compareTo(o2[0]);
      });   
      Arrays.sort(worker);
        int i=0;
        int bestPaySoFar=0,totalProfit=0;
         for(int k = 0; k < worker.length; k++){
         int ability = worker[k];
             while(i < pair.length && ability >= pair[i][0]){
            if(bestPaySoFar < pair[i][1])
                bestPaySoFar = pair[i][1];
            i++;
        }
              totalProfit+= bestPaySoFar;
         }
        return totalProfit;
    }
}