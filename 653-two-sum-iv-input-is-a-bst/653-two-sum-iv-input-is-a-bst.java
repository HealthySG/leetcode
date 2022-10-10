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
    Set<Integer> st=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        //if(r)
        if(st.contains(root.val))
            return true;
        boolean g=false,h=false;
        st.add(k-root.val);
        if(root.left!=null)
        {
           // st.add(k-root.val);
            g=findTarget(root.left,k);
        }
        if(root.right!=null)
        {
            //st.add(k-root.val);
            h=findTarget(root.right,k);
        }
        return g||h;
       /* findTarget(root.right,k);
        findTarget(root.left,k);
        if(k-root.val>root.val)
        {
            
            return findTarget(root.right,k);
        }  */
      /*  else
        {
             st.add(k-root.val);
             return findTarget(root.left,k);
        }*/
    }
}