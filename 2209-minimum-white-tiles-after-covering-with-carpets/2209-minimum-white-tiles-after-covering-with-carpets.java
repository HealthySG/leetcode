// class Solution {
//     public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
//      // int low=  
//         return rec(0,floor,numCarpets,carpetLen);
//     }
//     int rec(int idx,String floor,int numCarpets, int carpetLen)
//     {
//         int nottake=Integer.MAX_VALUE,take=Integer.MAX_VALUE;
//         if(idx>=floor.length())
//         {
//             return 0;
//         }
//          take=(floor.charAt(idx)=='0')?0:1+rec(idx+1,floor,numCarpets,carpetLen);
//         if(numCarpets>0)
//         {
//              nottake=rec(idx+carpetLen,floor,numCarpets-1,carpetLen);
//         }
//         return Math.min(take,nottake);
//     }
// }
class Solution {
public int minimumWhiteTiles(String floor, int numCarpets, int carpetLen) {
// we have to cover the tiles we first see the color if it is black
// we leave if its white we have option to jump or we cover it;
int dp[][]= new int[floor.length()+1][numCarpets+1];
for(int a[]: dp){
Arrays.fill(a, -1);
}
return helper( 0, numCarpets, carpetLen, dp, floor);
}
public int helper(int i, int nc, int l, int[][] dp, String s){

    if(i>= s.length()) return 0;
    if(nc<=0){
        int cnt=0;
        for(int j= i; j<s.length(); j++){
            if(s.charAt(j)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
    
    if(dp[i][nc]!=-1) return dp[i][nc];
    
    
    if(s.charAt(i)=='0'){
        return dp[i][nc]= helper(i+1, nc,l , dp , s);
    }
    else{
        int jump= 1+ helper(i+1, nc, l, dp, s);
        int cover= helper(i+ l, nc-1, l, dp, s);
        
        return dp[i][nc]= Math.min(jump, cover);
    }
    
}
}