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
    public int averageOfSubtree(TreeNode root) {
         help(root);
        return ans;
    }
    int[] help(TreeNode root)
    {
     //   int div=0;
        if(root==null)
            return new int[]{0,0};
        int[] left=help(root.left);
        int[] right=help(root.right);
        int currsum=left[0]+right[0]+root.val;
        int currcount=left[1]+right[1]+1;
        if((currsum/currcount)==root.val)
        {
           
                ans++;
        
        //    return root.val/(div+1);
        }
      /*  if(root.left==null)
        {
            if(root.val+help(root.right)/(div+2)==root.val)
            {
                ans++;
            }
            
        }
        if(root.right==null)
            return help(root.left)+root.val/(div+2);
        if(root.left!=null && root.right!=null)
            return (help(root.left)+root.val+help(root.right))/(div+3);
        else 
            return 0;
         */
        return new int[]{currsum,currcount};
    }
}