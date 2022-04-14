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
    public TreeNode searchBST(TreeNode root, int val) {
        Solution t=new Solution();
        TreeNode catch1=t.search(root,val);
        if(catch1!=null)
        {
         return catch1;
        }
        else
            return null;
        
    }
        TreeNode search(TreeNode root,int s)
        {
            TreeNode current=root;
            //System.out.println("current is"+current.val);
            TreeNode catch1=null;
            while(current!=null)
            {
                //System.out.println("current is"+current.val);
                if(current.val<s)
                {
                    current=current.right;
                    if(current==null)
                       return null;
                    System.out.println("current is"+current.val);
                    if(current.val==s)
                    {
                        catch1=current;
                        return catch1;
                    }
                }
               else if(current.val>s)
                {
                    current=current.left;
                    if(current==null)
                        return null;
                    else
                    {
                        if(current.val==s)
                        {
                            catch1=current;
                            return catch1;
                        }
                    }
                }
                else
                {
                    return root;
                }
            }
       // print1(catch1);
        return catch1;
    }
}