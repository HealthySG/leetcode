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
    public int rob(TreeNode root) {
      return rec(root,new HashMap<TreeNode,Integer>());
    }
    int rec(TreeNode root,HashMap<TreeNode,Integer>m)
    {
        if(root==null)
            return 0;
        if(m.containsKey(root))
            return m.get(root);
        int childsum=0,grandson=0;
         if(root.left!=null)
         {
              childsum+=rec(root.left,m);
              grandson+=rec(root.left.left,m)+rec(root.left.right,m);
         }
        if(root.right!=null)
        {
          childsum+=rec(root.right,m);
          grandson+=rec(root.right.left,m)+rec(root.right.right,m);  
        }
        m.put(root,Math.max(childsum,root.val+grandson));
        return m.get(root);
    }
}