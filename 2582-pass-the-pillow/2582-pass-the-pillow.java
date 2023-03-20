class Solution {
    public int passThePillow(int n, int time) {
        int dir=0;
        int y=1;
        while(time!=0)
        {
        if(dir==0)
        {
            while(y!=n && time!=0)
            {
                time--;
                y++;
            }
            if(time!=0)
            {
                dir=1;
            }
        }
        else{
             while(y!=1 && time!=0)
            {
                time--;
                y--;
            }
            if(time!=0)
            {
                dir=0;
            }    
        }
            //return y;
    }
        return y;
}
}