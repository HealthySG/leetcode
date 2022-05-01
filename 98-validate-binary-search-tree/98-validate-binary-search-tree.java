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
/*class Solution {
    public boolean isValidBST(TreeNode root) {
        return rec(root);
    }
    boolean rec(TreeNode root)
    {
        if(root.left !=null)
        {
           if(root.left.val>=root.val)
           {
               return false;
           }
        }
        if( root.right !=null)
        {
           if(root.right.val<=root.val)
           {
               return false;
           }
            return true;
        }
        if(root.left ==null && root.right ==null)
            return true;
        if(root.left ==null)
            return true;
        if(root.right ==null)
            return true;
        return rec(root.left) && rec(root.right); 
    }
}*/
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean isBST(TreeNode root,long min,long max)
    {
        if(root == null)
            return true;
        
        System.out.println(root.val + " "+min + " "+max);
        if(root.val <= min || root.val >= max)
            return false;
        
        boolean left = isBST(root.left,min,root.val);
        boolean right = isBST(root.right,root.val,max);
        return left && right;
    }
}