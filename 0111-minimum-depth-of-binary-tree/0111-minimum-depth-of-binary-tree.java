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
    static int count=0;
    public int minDepth(TreeNode root) {
       if(root==null)
            return count;
        if(root.left!=null && root.right!=null)
        {
            //count++;
            return 1+ Math.min(minDepth(root.left),minDepth(root.right));
        }
else
{
    return Math.max(minDepth(root.left),minDepth(root.right))+1;
}
    }
}