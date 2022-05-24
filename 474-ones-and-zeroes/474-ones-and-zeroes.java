class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        
        dp=new int[m+1][n+1][strs.length+1];
            for(int[][] i : dp)  {
            for(int[] j : i) {
                Arrays.fill(j, -1);
            }
        }
       // Integer[][][] dp=new Integer[101][101][601];
        Pair[] a=new Pair[strs.length];
        int zero=m,one=n;
        for(int i=0;i<strs.length;i++)
        {
            count01(strs[i],a,i);
             //System.out.println(a[i].c0);
             //System.out.println(a[i].c1);
        }
        
        return help(a,0,0,0,zero,one,dp);
    }
    int help(Pair[] a,int m, int n,int i,int zero,int one,int[][][] dp)
    {
       // System.out.println("i ans --- "+ i);
        int y=0,op1=0,op2=0;
        if(i>=a.length)
            return 0;
        
        if(m>zero || n>one)
            return 0;
        if(dp[m][n][i]!=-1)return dp[m][n][i];
        if(m+a[i].c0<=zero && n+a[i].c1<=one)
        {
            op1=1+help(a,m+a[i].c0,n+a[i].c1,i+1,zero,one,dp);
            op2=help(a,m,n,i+1,zero,one,dp);
        }
        else
        {
            
            y= help(a,m,n,i+1,zero,one,dp);
        }
         dp[m][n][i]=(Math.max(Math.max(op1,op2),y));
        return dp[m][n][i];
    }
    void count01(String s,Pair[] a,int i)
    {
        int count0=0,count1=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='0')
                count0++;
            else
                count1++;
        }
        a[i]=new Pair(count0,count1);
       
    }
}

class Pair
{
    int c0;
    int c1;
    Pair(int c0,int c1)
    {
        this.c0=c0;
        this.c1=c1;
    }
}	
