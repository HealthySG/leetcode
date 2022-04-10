class Solution {
   /* public String minimizeResult(String expression) {
         int len=expression.length();
        int idx=expression.indexOf('+');
        int i=0,j=expression.length();
             int temp=Integer.MIN_VALUE;
        int op=0,cp=0;
        int ans=Integer.MAX_VALUE;
        for(j=len-1;j>idx;j--)
        {
       for(i=0;i<idx;i++)
       {      
           if(i!=0 && j!=len-1)
           {
            temp=Integer.parseInt(expression.substring(0,i))*(Integer.parseInt(expression.substring(i,idx))+Integer.parseInt(expression.substring(idx+1,j+1)))*Integer.parseInt(expression.substring(j,len));
              System.out.println(temp); 
           }
           else if(i!=0 && j==len-1)
           {
               temp=Integer.parseInt(expression.substring(0,i))*(Integer.parseInt(expression.substring(i,idx))+Integer.parseInt(expression.substring(idx+1)));
           }
           else if(i==0 && j!=len-1)
           {
               temp=(Integer.parseInt(expression.substring(i,idx))+Integer.parseInt(expression.substring(idx+1,j+1)))*Integer.parseInt(expression.substring(j));
           }
           else
           {
               temp=(Integer.parseInt(expression.substring(i,idx))+Integer.parseInt(expression.substring(idx+1)));
           }
         //  ans=temp;
           if(ans>temp)
           {
               ans=temp;
               cp=j;
               op=i;
           }
           
        }
            
        }
        StringBuilder sb=new StringBuilder();
        i=0;
        while(i!=op)
        {
          sb.append(expression.charAt(i));
            i++;
        }
        sb.append('(');
       
        while(i!=cp+1)
        {
          sb.append(expression.charAt(i));
            i++;
        }
        sb.append(')');
        while(i!=len)
        {
          sb.append(expression.charAt(i));
            i++;
        }
        System.out.println(cp);
        System.out.println(op);
        System.out.println(ans);
        return sb.toString();
        */
    public static final String LFTB = "(";
    public static final String RGTB = ")";
    public static final String PLUS = "+";
    public String minimizeResult(String expression) {
        int n = expression.length();
        int minRslt = Integer.MAX_VALUE;
        
        // a, b .. stands for final best values
        int a = 1, b = 1;
        int c = 1, d = 1;
        int pluspos = expression.indexOf("+");
        
        // ca stands for candidate a, and so on.
        int ca, cb, cc, cd;
        for(int lft = 0; lft <= pluspos;lft++){
            ca = 1; cb = 1;
            if (lft > 0){
                ca = Integer.parseInt(expression.substring(0, lft));
            }
            if (lft != pluspos){
                cb = Integer.parseInt(expression.substring(lft, pluspos));
            }
            for(int rgt = pluspos+1; rgt <= n; rgt++){
                cc = 1; cd = 1;
                if (rgt != pluspos+1){
                    cc = Integer.parseInt(expression.substring(pluspos+1,rgt));
                }
                if (rgt != n){
                    cd = Integer.parseInt(expression.substring(rgt, n));
                }
                // candmn - stands for candidate min
                int candmn = ca *(cb + cc) * cd;
                /***
                System.out.println("ca = " + ca + " cb = " + cb);
                System.out.println("cc = " + cc + " cd = " + cd);
                System.out.println("candmn = " + candmn + " rslt = " + minRslt);
                ***/
                if (candmn < minRslt){
                    a = ca;
                    b = cb;
                    c = cc;
                    d = cd;
                    minRslt = candmn;
                }
            }
        }
        

        StringBuilder sb = new StringBuilder();
        // System.out.println("a = " + a + " b =" + b + " chat is " + expression.charAt(0));
        String lftPart = String.valueOf(a) + String.valueOf(b);
        if (lftPart.equals(expression.substring(0,pluspos))){
            sb.append(String.valueOf(a));
            sb.append(LFTB);
            sb.append(String.valueOf(b));
        } else {
            sb.append(LFTB);
            sb.append(String.valueOf(b));
        }

        sb.append(PLUS);
        sb.append(String.valueOf(c));
        sb.append(RGTB);
        String rgtPart = String.valueOf(c) + String.valueOf(d);
        if (rgtPart.equals(expression.substring(pluspos+1))){
            sb.append(String.valueOf(d));
        }
 
        return sb.toString();
    }
}