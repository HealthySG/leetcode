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
    int moves=0;
    public int distributeCoins(TreeNode root) {
        rec(root);
        return moves;
    }
    int rec(TreeNode root)
    {
        if(root==null)
            return 0;
        int res=0;
        int left=rec(root.left);
        int right=rec(root.right);
        res=(Math.abs(left)+Math.abs(right));
        moves+=(res);
        return root.val+left+right-1;
    }
}