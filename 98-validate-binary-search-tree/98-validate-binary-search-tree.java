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
    public boolean isValidBST(TreeNode root) {
       return rec(root,Long.MAX_VALUE,Long.MIN_VALUE);    
    }
    boolean rec(TreeNode root,long max,long min)
    {
         boolean left=true,right=true;
        // System.out.println(root.val+" max "+ max + "min  " + min);   
        if(root.val<=min || root.val>=max)
        {
            return false;
        }
        if(root.left!=null)
        {
             left=rec(root.left,root.val,min);
         //   System.out.println(left);
        }
        if(root.right!=null)
        {
             right=rec(root.right,max,root.val);
        }
       //  System.out.println("left "+ left + "right" + right);
        return left && right;
    }
}