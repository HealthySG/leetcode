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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null )
            return false;
        // if(root==null && targetSum!=0)
            // return false;
            
       return rec(root,targetSum-root.val);
        
    }
   boolean rec(TreeNode root,int targetSum)
    {
       boolean l=false,r=false;
        if(root.left==null && root.right==null && targetSum==0)
        {
            return true;
        }
        if(root.left!=null)
        {
             l=rec(root.left,targetSum-root.left.val);
        }
        if(root.right!=null)
        {
              r=rec(root.right,targetSum-root.right.val);
        }
       return r||l;
    }
}