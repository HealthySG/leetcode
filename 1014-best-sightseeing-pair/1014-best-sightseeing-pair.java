class Solution {
    public int maxScoreSightseeingPair(int[] values) {
         final int n =values.length;
        
        int[] P = new int[n];
        int[] S = new int[n];
        
        S[n - 1] = values[n - 1] - (n - 1);
        
        // Prepare backward
        for (int i = n - 2; i >= 0; i--) {
            S[i] = Math.max(values[i] - i, S[i + 1]);    
        }
        
        // Prepare forward
        for (int i = 0; i < n; i++) {
            P[i] = values[i] + i;
        }
        
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            // For all possible positions of i, 
            // search the best j such that 
            // A[j] - j was the maximum possible
            // along with A[i] + i itself
            // S[i + 1] because we cannot double
            // count index i
            best = Math.max(best, P[i] + S[i + 1]);
        }
        return best;
    }
}