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
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length ==0){
            return null;
        }
        return getTreeNode(nums, 0, nums.length-1);
    }
    
    private TreeNode getTreeNode(int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        int middle = start + (end-start)/2;
        TreeNode n = new TreeNode(nums[middle]);
        n.left = getTreeNode(nums, start, middle-1);
        n.right = getTreeNode(nums, middle+1, end);
        return n;
    
    }
}