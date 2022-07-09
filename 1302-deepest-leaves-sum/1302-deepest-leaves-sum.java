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
/*//BFS sol :-
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        long sum=0;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            boolean f=false; // sum=0 levelwise sum
            for(int i=0;i<size;i++)
            {
                TreeNode t=q.poll();
                if(!f) //not needed
                  sum+=t.val;
            //    System.out.println("sum " +sum);
                if(t.left!=null)
                {
                     q.add(t.left);
                     sum=0;
                     f=true;
                }
                if(t.right!=null)
                {
                     q.add(t.right);
                     sum=0;
                     f=true;
                }
                   
            }
        }
        return (int)sum;
    }
}
*/
class Solution {
    
   private int maxLevel = 0;
    private int sum = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        calculateSumAtLevel(root,0);
        return sum;
        
    }
    
    private void calculateSumAtLevel(TreeNode root,int level){
        
       if(root == null) return;
        if(level > maxLevel){  //Main condition how can we did it in single pass.
            sum = 0;
            maxLevel = level;
        }
        if(level == maxLevel){
            sum = sum + root.val; //calculated levelwise sum if node have same level.
        }
        calculateSumAtLevel(root.left,level+1);
        calculateSumAtLevel(root.right,level+1);
    }
}
