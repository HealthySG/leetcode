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
    public boolean isUnivalTree(TreeNode root) {
        int data=root.val;
        //boolean f1=false;
       // boolean f2=false;
        return check(root,data);
        /*if(f1!=false)
            return false;
        else
            return true;
            */
        
    }
    boolean check(TreeNode root,int data)
    {
        
        if(root==null)
            return true;
        if(root.val!=data)
        {
           return false;
           //f2=false;
        }
    
         return  check(root.left,data) && check(root.right,data);
        
      // return f1;
            
    }
}