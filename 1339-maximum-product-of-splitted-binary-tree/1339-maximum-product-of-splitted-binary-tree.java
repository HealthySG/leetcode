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
    long ans=0;
    public int maxProduct(TreeNode root) {
       // int ans=0;
        long c=0;
        c=csum(root,new long[1]);
        //System.out.println(c);
        cproduct(root,c);
      //  System.out.println("ans " + ans);
        return (int)(ans%((int)Math.pow(10,9)+7));
    }
    long csum(TreeNode root,long[] count)
    {
        if(root==null)
            return 0;
        else
        {
            count[0]+=root.val;
            csum(root.left,count);
            csum(root.right,count);
        }
        return count[0];
    }
    long cproduct(TreeNode root,long c)
    {
        if(root==null)
            return 0;        
        long sum=(root.val+cproduct(root.left,c)+cproduct(root.right,c));
        
        ans=Math.max(ans,(c-sum)*sum);
       // System.out.println(ans);
        return sum;
    }
}