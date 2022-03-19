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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> a=new ArrayList<>();
        help(root,"",a);
         return a;
    }
    void help(TreeNode root,String path,List<String> a)
    {
        //String s="";
        if(root.left==null && root.right==null)
        {
              a.add(path+root.val);
             // return 0;
             // return root.val;
        }
        if(root.left!=null)
        {
          help(root.left,path+root.val+"->",a);
        }
        if(root.right!=null)
        {
          help(root.right,path+root.val+"->",a);
        }
        
       // help(root.left)
      //  System.out.println("s"+s);
       // return root.val;
    }
    
}