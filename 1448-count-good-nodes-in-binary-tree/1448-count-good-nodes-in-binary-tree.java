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
    int count=0;
    public int goodNodes(TreeNode root) {
         rec(root,root);
         return count+1; // +1 for we count root also. 
    }
    void rec(TreeNode root,TreeNode prev)
    {
        if(root.left!=null)
        {
            if(root.left.val<prev.val)
            {
                rec(root.left,prev);
            }
            if(root.left.val>=prev.val)
            {
                 count++;
                rec(root.left,root.left);
               
            }
        }
        if(root.right!=null)
        {
             if(root.right.val<prev.val)
            {
                rec(root.right,prev);
            }
            if(root.right.val>=prev.val)
            {
                count++;
                rec(root.right,root.right);
                
            }
        }
        return;
    }
}