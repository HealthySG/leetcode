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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
          ArrayList<Integer> a=new ArrayList<>();
         help(root,a,targetSum);
      return ans;  
    }
    void help(TreeNode root,List<Integer> a,int targetSum)
    {
        if(root==null)
        {
              return;  
        }
        a.add(root.val);
        if(root.left==null && root.right==null && targetSum==root.val)
        {
            ans.add(new ArrayList<Integer>(a));
        }
        else
        {
            help(root.left,a,targetSum-root.val);
            help(root.right,a,targetSum-root.val);
        }
        a.remove(a.size()-1);
    }
}