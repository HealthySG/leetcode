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
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
        rec(root);
        return max;
    }
    int rec(TreeNode root)
    {
        if(root==null)
            return 0;
        int l=rec(root.left);
        int r=rec(root.right);
        if(root.left!=null && root.left.val==root.val)
            l++;
        else
            l=0;
        if(root.right!=null && root.right.val==root.val)
            r++;
        else
            r=0;
         max = Math.max(max, l+r);
        return Math.max(l,r);
        
        
        
    }
}