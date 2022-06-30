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
    List<String> paths;   
    public String getDirections(TreeNode root, int startValue, int destValue) {
         if(root == null)
            return "";
        paths = new ArrayList();
        
        TreeNode f=rec(root,startValue,destValue);
        spath(f,startValue,new StringBuilder());
        spath(f,destValue,new StringBuilder());
        StringBuilder result = new StringBuilder();
        
        for(int i = 0 ; i < paths.get(0).length(); i++)
            result.append("U");
        result.append(paths.get(1));
        return result.toString();
    }
    TreeNode rec(TreeNode root,int p,int q)
    {
        if(root==null || root.val==p || root.val==q)
            return root;
        TreeNode left=rec(root.left,p,q);
        TreeNode right=rec(root.right,p,q);
        if(left!=null && right!=null)
            return root;
        return left!=null?(left):(right);
    }
    void spath(TreeNode f,int startValue,StringBuilder path)
    {
        if(f==null)
            return;
        if(f.val==startValue)
        {
            paths.add(path.toString());
            return;
        }
        
        if(f.left!=null)
            spath(f.left,startValue,path.append("L"));
        if(f.right!=null)
           spath(f.right,startValue,path.append("R"));
        path.deleteCharAt(path.length()-1);
    }
}