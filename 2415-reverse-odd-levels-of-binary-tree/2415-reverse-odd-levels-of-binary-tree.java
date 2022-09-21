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
    public TreeNode reverseOddLevels(TreeNode root) {
         rec(root.left,root.right,0);
         return root;
    }
    void rec(TreeNode root1,TreeNode root2,int level)
    {
        if(root1==null || root2==null)
            return;
        if((level&1)==0)
        {
            int temp=root2.val;
            root2.val=root1.val;
            root1.val=temp;
        }
        rec(root1.left,root2.right,level+1);
        rec(root1.right,root2.left,level+1);
    }
}