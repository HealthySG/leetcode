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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) {
            return Collections.emptyList();
        }
        List<List<Integer>> ans = new ArrayList<>();
         List<Integer> u=new ArrayList<>();
         u.add(root.val);
        ans.add(u);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
           u=new ArrayList<>();
            while(size-->0)
            {
                 TreeNode s=q.remove();
                 if(s.left!=null)
                 {
                     u.add(s.left.val);
                     q.add(s.left);
                 }
                 if(s.right!=null)
                 {
                      u.add(s.right.val);
                     q.add(s.right);
                 }
            }
             if(!u.isEmpty())
                ans.add(u);
        }
        return ans;
    }
}