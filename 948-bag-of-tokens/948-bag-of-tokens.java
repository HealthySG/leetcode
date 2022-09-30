class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0)
            return 0;
        
        if(tokens.length==1)
        {
            if(tokens[0]>power)
                return 0;
            else
                return 1;
        }
        Arrays.sort(tokens);
        int s=0;
        int i=0,j=tokens.length-1;
        while(i<j)
        {
            if(tokens[i]<=power)
            {
                s++;
                 power-=tokens[i];
                i++;
            }
            else
            {
                power+=tokens[j];
                s--;
                j--;
            }
            System.out.println(power);
             if(s<0)
            return 0;
        }
       
        if(power>=tokens[i])
            s++;
        return s<0?0:s;
    }
}