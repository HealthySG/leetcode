class Solution {
    public String discountPrices(String sentence, int discount) {
      /*  int l=sentence.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)=='$')
            {
                 sb.append(sentence.charAt(i));
                int j=i+1;
                while(sentence.charAt(j)!=' ' && j!=l)
                {
                    j++;
                }
                Long d=Long.parseLong(sentence.substring(i+1,j));
             //   System.out.println(d);
                double h=Math.floor(d*discount)/100;
                System.out.println(Math.round(h*1000.0)/1000.0);
               // System.out.println(d-(d*discount)/100);
                char[] arr=String.valueOf(d-(d*discount)/100).toCharArray();
                for(int k=0;k<arr.length;k++)
                    sb.append(arr[k]);
                i+=j;
            }
            sb.append(sentence.charAt(i));
        }
        return sb.toString();
        */
        String[] sen = sentence.split(" ");
        for(int i=0;i<sen.length;i++) {
            if(sen[i].charAt(0)!='$' || sen[i].length()<2) continue;
            long a =0;
            boolean f=true;
            for(int j=1;j<sen[i].length();j++){
                char c =sen[i].charAt(j);
                if(Character.isDigit(c)){
                    a *= 10;
                    a += (c-'0');
                }else{
                    f=false;
                    break;
                }
            }
            
            if(f){
                double dou = a*0.01*discount;
                dou = (double)a - dou;
                sen[i]="$"+String.format("%.2f", dou);
            }
        }
        return String.join(" ",sen);
    }
}