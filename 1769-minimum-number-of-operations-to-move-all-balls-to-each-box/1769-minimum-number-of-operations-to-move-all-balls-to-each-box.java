class Solution {
    public int[] minOperations(String boxes) {
       // Set<Integer> l=new HashSet<>();
        //int[] ans=new int[boxes.length()];
       // int c=0;
      /*  for(int i=0;i<boxes.length();i++)
        {
            if(boxes.charAt(i)=='1')
            {
                l.add(i);
                c++;
            }
        }
        for(int i=0;i<boxes.length();i++)
        {
            int temp=0;
          for (Integer it : l) {
                temp+=Math.abs(it-i);
            }
            ans[i]=temp;
        }
        return ans;*/
        int[] res = new int[boxes.length()];
    for (int i = 0, ops = 0, cnt = 0; i < boxes.length(); ++i) {
       res[i] += ops;
       cnt += boxes.charAt(i) == '1' ? 1 : 0;
       ops += cnt;
    }    
    for (int i = boxes.length() - 1, ops = 0, cnt = 0; i >= 0; --i) {
        res[i] += ops;
        cnt += boxes.charAt(i) == '1' ? 1 : 0;
        ops += cnt;
    }
    return res;
    }
}