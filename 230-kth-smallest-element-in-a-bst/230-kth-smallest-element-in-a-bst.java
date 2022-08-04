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
    int ans=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        rec(root,k);
        return  ans;
    }
    void rec(TreeNode root,int k)
    {
       if(root.left!=null)
           rec(root.left,k);
        count++;
        if(count==k)
        {
               ans=root.val;
               return;
        }
        if(root.right!=null)
           rec(root.right,k);
       
    }
}