/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  //  Set<Integer> st=new HashSet<>();
    List<Integer> l=new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) {
       // Queue<TreeNode> q=new LinkedList<>();
        rec(root,0);
        return l;
    }
   /* 1)-The same thing can also be achieved by comparing the size of the ans list to the current level without using a hashset.
2)-because each level print only one node.*/
   void rec(TreeNode root,int level)
    {
        if(root==null)
            return;
        if(l.size()==level) //
        {
             l.add(root.val);
            // st.add(level);
        }
        
        rec(root.right,level+1);
         rec(root.left,level+1);
    }
}