class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
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
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(node.child[c-'a']==null)
            {
                return false;
            }
            else
            {
                node=node.child[c-'a'];
            }
        }
        return node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
         TrieNode node=root;
        for(int i=0;i<prefix.length();i++)
        {
            char c=prefix.charAt(i);
            if(node.child[c-'a']==null)
            {
                return false;
            }
            else
            {
                node=node.child[c-'a'];
            }
        }
        return true;
    }
}
class TrieNode
{
    TrieNode[] child=new TrieNode[26];
    boolean isEnd=false;
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */