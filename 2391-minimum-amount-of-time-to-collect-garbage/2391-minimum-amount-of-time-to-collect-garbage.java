class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
            int p=0, m=0, g=0, sum=0;

    for(int i=0; i<garbage.length; i++){
        for(char ch : garbage[i].toCharArray()){
            if(ch=='P') p = i;
            else if(ch=='M') m = i;
            else if(ch=='G') g = i;
            sum++;                         // add 1 min for every pick-up
        }
    }
    
    for(int i=1; i<travel.length; i++)
        travel[i] = travel[i]+travel[i-1];
    
    sum += p==0 ? 0 : travel[p-1];            // travel time till last P
    sum += m==0 ? 0 : travel[m-1];          // travel time till last M
    sum += g==0 ? 0 : travel[g-1];            // travel time till last G
    return sum;
    }
}