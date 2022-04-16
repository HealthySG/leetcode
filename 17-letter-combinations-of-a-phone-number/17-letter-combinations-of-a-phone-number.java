/*class Solution {
   private static final String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> l=new LinkedList<>();
        System.out.println(digits);
        combinations("",digits,l,0);
        return l;
    }
 private void combinations(String ans,String digits,List<String> l,int i)
    {
       // System.out.println(ans);
        if(i>=ans.length())
        {
            l.add(ans);
            return;
        }
        String temp=map[digits.charAt(i)-'0'];
        System.out.println(temp);
        for(int j=0;j<temp.length();j++)
        {
           combinations(ans+temp.charAt(j),digits,l,i+1);
        }
    }
    
}
*/
public class Solution {
    	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    	public List<String> letterCombinations(String digits) {
            List<String> ret = new ArrayList<String>();
            if(digits.length()==0)
            {
                
                return ret;
            }
                
    		//List<String> ret = new LinkedList<String>();
    		combination("", digits, 0, ret);
    		return ret;
    	}
    
    	private void combination(String prefix, String digits, int offset, List<String> ret) {
    		if (offset >= digits.length()) {
    			ret.add(prefix);
    			return;
    		}
    		String letters = KEYS[(digits.charAt(offset) - '0')];
    		for (int i = 0; i < letters.length(); i++) {
    			combination(prefix + letters.charAt(i), digits, offset + 1, ret);
    		}
    	}
    }