class Solution {
  //  Set<Integer> st=new HashSet<>();
    public int videoStitching(int[][] clips, int time) {
     //   rec(clips,time,0);
        Integer[][] dp = new Integer[time + 1][clips.length + 1];
        for (Integer[] row: dp) {
            row[0] = -1;
        }
        Arrays.fill(dp[0], 0);
        
        // sort the clips by start time
        Arrays.sort(clips, (a, b) -> a[0] - b[0]);
        
        return recurse(clips, time, clips.length, dp);
    }
    private int recurse(int[][] clips, int time, int size, Integer[][] dp) {
        // check dp table
        if (dp[time][size] != null) {
            return dp[time][size];
        }
        
        // skip the current clip
        int skip = recurse(clips, time, size - 1, dp);
        
        // take the current clip is possible
        int[] newClip = clips[size - 1];
        int take = -1;
        if (newClip[0] < time && newClip[1] >= time) {
            take = recurse(clips, newClip[0], size - 1, dp);
        }
        
        // return the optimal result
        int res = -1;
        if (skip == -1 && take != -1) {
            res = 1 + take;
        }
        else if (skip != -1 && take == -1){
            res = skip;
        }
        else if (skip != -1 && take != -1) {
            res = Math.min(skip, 1 + take);
        }
        
        // update dp table
        dp[time][size] = res;
        return res;
    }
}