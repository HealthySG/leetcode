/*class Solution {
     Pair[] a=new Pair[52];
    public String frequencySort(String s) {
        Map<Integer,Integer> m=new HashMap<>();
         for(int i=0;i<s.length();i++)
         {
             
         }
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                if(a[s.charAt(i)-'a']==null)
                {
                     Pair p=new Pair(s.charAt(i),0);
                     a[s.charAt(i)-'a']=p;
                }    
                else
                {
                    Pair p=a[s.charAt(i)-'a'];
                    (p.frequency)++;
                     a[s.charAt(i)-'a']=p;
                }
            }
            else
            {
                 if(a[s.charAt(i)-'A'+26]==null)
                {
                     Pair p=new Pair(s.charAt(i),0);
                     a[s.charAt(i)-'A'+26]=p;
                }    
                else
                {
                    Pair p=a[s.charAt(i)-'A'+26];
                    (p.frequency)++;
                     a[s.charAt(i)-'A'+26]=p;
                }
            }
           
        }
        
        a=Arrays.stream(a).filter(arrayEle -> arrayEle!=null).toArray(Pair[]::new);
        
        Arrays.sort(a,(x,y)->{
           
              //   System.out.println(" comparing " + x.ele + " and " + y.ele);
                return y.frequency-x.frequency;
           
        });
        StringBuilder output=new StringBuilder();
            for(Pair e : a)
            {
               
                    int i=0;
                    //System.out.println(e.frequency);
                    while(i != e.frequency+1)
                    {
                        output.append(e.ele);
                        i++;
                    }
                
            }
         // System.out.println(output.toString());
        return output.toString();
    }
}
class Pair
{
    char ele;
    int frequency;
    Pair(char ele,int f)
    {
        this.ele=ele;
        this.frequency=f;
    }
}
*/
public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
            map.put(c, map.getOrDefault(c, 0) + 1);
						
        List<Character> [] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }
				
        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >= 0; pos--)
            if (bucket[pos] != null)
                for (char c : bucket[pos])
                    for (int i = 0; i < pos; i++)
                        sb.append(c);

        return sb.toString();
    }
}
