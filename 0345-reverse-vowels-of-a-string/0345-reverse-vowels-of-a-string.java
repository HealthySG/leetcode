class Solution {
    public String reverseVowels(String s) {
         Character arr[] = {'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> st=new HashSet<>(Arrays.asList(arr)); 
        char[] df=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(st.contains(df[i]) && st.contains(df[j]))
            {
                swap(df,i,j);
                i++;
                j--;
            }
            else if(!st.contains(df[i]) && st.contains(df[j]))
            {
                i++;
            }
            else if(st.contains(df[i]) && !st.contains(df[j]))
            {
               j--;
            }
            else
            {
                i++;
                j--;
            }
        }
        return new String(df);
        
    }
    void swap(char[] df,int i,int j)
    {
        char temp=df[i];
        df[i]=df[j];
        df[j]=temp;
    }
}