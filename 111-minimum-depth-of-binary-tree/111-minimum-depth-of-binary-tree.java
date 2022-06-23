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
    int len=0;
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int lev=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode r=q.remove();
                if(r.left==null && r.right==null)
                  return (lev+1);
                if(r.left!=null)
                  q.add(r.left);
                if(r.right!=null)
                  q.add(r.right);
            }
            lev++; 
        }
       return 0;
    }
}