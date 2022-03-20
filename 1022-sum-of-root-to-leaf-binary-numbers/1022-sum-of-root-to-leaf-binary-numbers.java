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
    public int sumRootToLeaf(TreeNode root) {
        List<String> l=new ArrayList<>();
        int ans=0;
        help(root,"",l);
        for(String s:l)
        {
            int decimal=Integer.parseInt(s,2);
            ans+=decimal;
        }
        return ans;
    }
    List<String> help(TreeNode root,String b,List<String> l)
    {
        if(root.left==null && root.right==null)
        {
            l.add(b+""+root.val);
        }
        if(root.left!=null)
        {
            help(root.left,b+""+root.val,l);
        }
         if(root.right!=null)
        {
            help(root.right,b+""+root.val,l);
        }
        return l;
    }
    
}