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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode p1=p;
        TreeNode q1=q;
        
       /* while(p1!=null || q1!=null)
        {
            if(q1==null || p1.val!=q1.val)
            {
                return false;
            }
            p1=p1.left;
            
        }
        */
            
             /*(if(p1!=null && q1==null)
                 return false;*/
            if(p1==null && q1==null)
              return true;
            else if(p1!=null && q1!=null)
            {
                return (p1.val==q1.val) && (isSameTree(p1.left,q1.left)) && (isSameTree(p1.right,q1.right));
               // isSameTree(p1.right,q1.right);
                 //isSameTree();
            }
            return false;    
        }
}