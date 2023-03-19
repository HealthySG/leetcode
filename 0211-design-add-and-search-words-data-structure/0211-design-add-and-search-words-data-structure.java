class WordDictionary {
    TrieNode root;
    public WordDictionary() {
         root=new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node=root;
         for(int i=0;i<word.length();i++)
         {
             char c=word.charAt(i);
             if(node.child[c-'a']==null)
             {
                 node.child[c-'a']=new TrieNode();
             }
             node=node.child[c-'a'];
         }
         node.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode node=root;
        return dfs(word,0,node);
    }
    boolean dfs(String word,int i,TrieNode node)
    {
        if(node==null)
            return false;
        if(i>=word.length())
            return node.isEnd;
        char c=word.charAt(i);
        if(c=='.')
        {
            for(int j=0;j<26;j++)
            {
                 if(dfs(word,i+1,node.child[j]))
                     return true;
            } 
        }
        else
        {
            if(dfs(word,i+1,node.child[c-'a']))
                 return true;
        } 
        return false;
    }
     
    
}
class TrieNode
{
    TrieNode[] child=new TrieNode[26];
    boolean isEnd=false;
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */