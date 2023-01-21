class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<String>();
        String restored="";
        rec(s,restored,0,0,ans);
        return ans;
    }
    void rec(String s,String restored,int idx,int c,List<String> ans)
    {
        if(c>4)
            return;
        if(c==4 && idx==s.length())
            ans.add(restored);
        for(int i=1;i<4;i++)
        {
            if(idx+i>s.length())
                break;
            String temp = s.substring(idx,idx+i);
              if ((temp.startsWith("0") && temp.length()>1) || (i==3 && Integer.parseInt(temp) >= 256)) continue;
            rec(s,restored+temp+(c==3?"" : "."),idx+i,c+1,ans);
        }
//         ans+=s.charAt(i);
//         if(ans-'0'<=255)
//         {
//             ans=ans+"."+rec(s,ans,i+1);
//             c++;
//         }
//         if(c==4 && i==s.length)
//         {
            
//         }
    }
}