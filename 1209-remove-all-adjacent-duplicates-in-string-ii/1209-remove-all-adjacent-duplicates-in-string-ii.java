class Solution {
    public String removeDuplicates(String s, int k) {
        
	int N = s.length();
	Stack<Pair> stk = new Stack<>();

	for (int i=0; i<N; i++) {
		char ch = s.charAt(i);
		if (stk.isEmpty() || stk.peek().ch != ch) {
			stk.push(new Pair(ch, 1));
		} else {
			stk.peek().freq++;
		}

		if (stk.peek().freq == k)
			stk.pop();
	}

	StringBuilder sb = new StringBuilder();

	for (Pair p : stk) {
		while(p.freq-- > 0)
			sb.append(p.ch);
	}

	return sb.toString();
}
       // if(s.length()==1)
         //   return s.charAt(0);
     /*   
        int[] a=new int[26];
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        Stack<Character> st=new Stack<>();
          st.add(s.charAt(0));
        a[s.charAt(0)-'a']++;
        for(int i=1;i<l;i++)
        {
         //   System.out.println("dq.peek()---" + st.peek());
            if(!st.isEmpty() && st.peek()==s.charAt(i) && (a[s.charAt(i)-'a'])+1>=k)
           {
            System.out.println("flag1");
                int temp=k-1;
             /*if(a[s.charAt(i)-'a']==k-1)
             {
                 temp=k;
             }
             else    
             {
                  temp=k-1;
                  
             }
             */
            /*    System.out.println("temp--" + temp);
             while(!st.isEmpty() && temp!=0)
             {
                 st.pop();
                 temp--;
             }
             a[s.charAt(i)-'a']-=k-1;
             System.out.println(st.toString());
               // System.out.println(Arrays.toString(a));
           }
           else
           {
               System.out.println("flag2");
               st.push(s.charAt(i));
               System.out.println(st.toString());
               a[s.charAt(i)-'a']++;
           }
        }
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        sb.reverse();
        
        return sb.toString();
*/

private class Pair {
	char ch;
	int freq;

	Pair(char ch, int freq) {
		this.ch = ch;
		this.freq = freq;
	}
}

}
