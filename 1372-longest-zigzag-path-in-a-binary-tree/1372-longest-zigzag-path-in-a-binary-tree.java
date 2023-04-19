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
    int len=1;
    int maxlen;
    public int longestZigZag(TreeNode root) {
        if(root==null)
            return -1;
        if(root.left!=null)
          maxzigzag(root.left,false,1);
        if(root.right!=null)
          maxzigzag(root.right,true,1);
        return maxlen;
    }
   void maxzigzag(TreeNode root,boolean dir,int steps)
    {
       if(root==null)
           return;
       maxlen=Math.max(maxlen,steps);
        if(dir==false)
        {
            maxzigzag(root.right,true,steps+1);
            maxzigzag(root.left,false,1);
        }
        else{
            maxzigzag(root.left,false,steps+1);
            maxzigzag(root.right,true,1);
        }
      
    }
}