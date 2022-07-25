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
    List<TreeNode> ans=new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
         List<Integer> al = Arrays.stream(to_delete)        
                                    .boxed()      
                                    .collect(Collectors.toList());
        Set<Integer> m=new HashSet<>(al);
      //  System.out.println("Printing set ");
     //   m.forEach(System.out::println);
      // System.out.println("Printing set end");
      
       rec(root,m);
        if(!m.contains(root.val))
       {
        ans.add(root);
       }
        return ans;
    }
    TreeNode rec(TreeNode root,Set<Integer> m)
    {
         
        if(root==null)
            return null;
       
        root.left=rec(root.left,m);
        root.right=rec(root.right,m);   
          if(m.contains(root.val))
        {
         //    System.out.println("root.val "+root.val);
            if(root.left!=null)
            {
               
            // System.out.println("root.left.val "+root.left.val);
              ans.add(root.left);
            }
            if(root.right!=null)
              ans.add(root.right);
            return null;  
        }
       
        return root;    
    }
}