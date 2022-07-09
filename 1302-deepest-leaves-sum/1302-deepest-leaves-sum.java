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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        long sum=0;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            boolean f=false;
            for(int i=0;i<size;i++)
            {
                TreeNode t=q.poll();
                if(!f)
                  sum+=t.val;
            //    System.out.println("sum " +sum);
                if(t.left!=null)
                {
                     q.add(t.left);
                     sum=0;
                     f=true;
                }
                if(t.right!=null)
                {
                     q.add(t.right);
                     sum=0;
                     f=true;
                }
                   
            }
        }
        return (int)sum;
    }
}