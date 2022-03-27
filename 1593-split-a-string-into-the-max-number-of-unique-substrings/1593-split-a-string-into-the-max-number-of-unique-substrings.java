class Solution {
    public int maxUniqueSplit(String s) {
      /*  Set<String> st=new HashSet<>(); 
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;)
        {
            if(st.contains(s.charAt(i)+""))
            {
                StringBuilder sb=new StringBuilder();
                sb.append(s.charAt(i++));
               // System.out.print(sb.toString());
                while(i<n && st.contains(sb.toString()))
               {
                  
                  sb.append(s.charAt(i));
                      System.out.println(sb.toString());
                    // System.out.print(sb.toString());
                  i++;
               }
                System.out.print(sb.toString());
                if(!st.contains(sb.toString()))
                {
                    st.add(sb.toString());
                  ans++;
                    
                }
            }
            else
            {
                ans++;
                st.add(s.charAt(i)+"");
                i++;
                 System.out.println("ELSE ANS" + ans);
            }
        }
        return ans;
        */
         int[] res = new int[1];
        Set<String> set = new HashSet<>();
        
        dfs(res, s, set, 0);
        return res[0];
    }
     private void dfs(int[] res, String s, Set<String> set, int cur) {
        if (cur == s.length()) {
            res[0] = Math.max(res[0], set.size());
            return;
        }
        
        for (int i = cur; i < s.length(); i++) {
            String word = s.substring(cur, i + 1);
            if (!set.contains(word)) {
                set.add(word);
                dfs(res, s, set, i + 1);
                set.remove(word);
            }
        }
     }

        
}