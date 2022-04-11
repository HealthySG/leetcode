/*class Solution {
    public int countVowelStrings(int n) {
        char[] srr=new char[]{'a','e','i','o','u'};
        HashMap<String,Integer> hm=new HashMap<>();
      //   int[][] dp=new int[6][51];
        //for(int i=0;)
        return rec(srr,"",0,n,'\0',hm);
    }
    int rec(char[] srr,String ans,int i,int n,char prev,HashMap<String,Integer> hm)
    {
        //int count=0;
        System.out.println(ans);
        if(ans.length()==n)
        {
           return 1;
        }
        String Key=srr[i]+"Satyam"+i;
        if(hm.containsKey(Key))
            return hm.get(Key);
        int count=0;
        for(i=0;i<srr.length;i++)
        {
            if(prev=='\0' || prev<=srr[i])
                count+=rec(srr,ans+srr[i],i,n,srr[i],hm);
        }
        hm.put(Key,count);
        return count;
    }
}
*/
class Solution {
    int[][] dp;

    public int countVowelStrings(int n) {
        dp = new int[n + 1][6];
        int count = go(0, n);
        return count;
    }

    private int go(int last, int n) {
        if (n == 0) return 1;
        if (dp[n][last] != 0) return dp[n][last];
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            if (i >= last) {
                count += go(i, n - 1);
            }
        }
        return dp[n][last] = count;
    }
}