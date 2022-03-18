/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode s=root;
   /*   if(s.val==p.val)
      {
          return s;
      }
      else if(s.val==q.val)
      {
          return s;
      }
    else 
    {
        return search(root,p);
    }
    }
    TreeNode search(TreeNode root,TreeNode p) 
    {
        if(root.val==p.val)
            return root;
        else if(root.left!=null)
            search(root.left,p);
        else if(root.right!=null)
            search(root.right,p);
        return root; 
    }
    */
             if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)   return root;
        return left != null ? left : right;
    }
   
}