class Solution {
 public int minSideJumps(int[] obstacles) {
        int dp[][]=new int[obstacles.length][4];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return helper(obstacles,obstacles.length,0,2,dp);
    }
    
    private int helper(int obstacles[],int length,int start,int lane,int [][]dp){
        /* if the last element is reached return*/
        if(start==length-1){
            return 0;
        }
        
        if(dp[start][lane]!=-1){
            return dp[start][lane];
        }
        
        /*if the next element in the current lane doesnot have a obstacle
        continue in the same lane*/
        if(lane!=obstacles[start+1]){ 
            return dp[start][lane]= helper(obstacles,length,start+1,lane,dp);
        }
        /*if the lane is 1 and the 2 and 3 doesnot contain obstacle then
        traverse those path and return the minimum value similarly for all other*/
        else{
            int jump1=0;
            int jump2=0;
             if(lane==1){
                 if(obstacles[start]!=2){
                     jump1=1+helper(obstacles,length,start+1,2,dp);
                 }
                 if(obstacles[start]!=3){
                     jump2=1+helper(obstacles,length,start+1,3,dp);
                 }
                 return dp[start][lane]= min(jump1,jump2);
             }
            else if(lane==2){
                 if(obstacles[start]!=1){
                     jump1=1+helper(obstacles,length,start+1,1,dp);
                 }
                 if(obstacles[start]!=3){
                     jump2=1+helper(obstacles,length,start+1,3,dp);
                 }
                 return dp[start][lane]=  min(jump1,jump2);
            }
            else{
                 if(obstacles[start]!=1){
                     jump1=1+helper(obstacles,length,start+1,1,dp);
                 }
                 if(obstacles[start]!=2){
                     jump2=1+helper(obstacles,length,start+1,2,dp);
                 }
                return dp[start][lane]=  min(jump1,jump2);
            }
            
        }        
    }
    
    private int min(int jump1,int jump2){
        
        if(jump1==0 && jump2==0){
            return 0;
        }
        else if(jump1==0){
            return jump2;
        }
        else if(jump2==0){
            return jump1;
        }
        else{
            return Math.min(jump1,jump2);
        }
    }
}