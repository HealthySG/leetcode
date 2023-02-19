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
/*
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        int l=1;
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
      List<Integer> u=new ArrayList<>();
        u.add(root.val);
        ans.add(u);
        TreeNode temp=null;
        while(!q.isEmpty())
        {
            for (TreeNode item: q) {
            System.out.println(item.val);
        }
            u=new ArrayList<>();
            
            if((l&1)==0)
            {
                int n=q.size();
                for(int i=0;i<n;i++)
                {
                    temp=q.removeFirst();
                    if(temp.left!=null)
                    {
                       
                         q.addLast(temp.left);
                         u.add(temp.left.val);
                         
                    }
                    if(temp.right!=null)
                    {
                         
                         q.addLast(temp.right);
                        u.add(temp.right.val);
                       
                        
                    }
                    
                }
                if(!u.isEmpty())
                ans.add(u);
                
            }
            else
            {
                int n=q.size();
                for(int i=0;i<n;i++)
                {
                    temp=q.removeFirst();
                    if(temp.right!=null)
                    {
                       
                         q.addLast(temp.right);
                         u.add(temp.right.val);
                       
                    }
                    if(temp.left!=null)
                    {
                     
                          q.addLast(temp.left);
                            u.add(temp.left.val);
                        
                    }
                    
                }
               if(!u.isEmpty())
                ans.add(u);
            }
            l++;
        }
        
        return ans;
        
    }
}*/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      if(root==null) {
            return Collections.emptyList();
        }
        
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
		List<List<Integer>> result = new ArrayList<>();
        List<Integer> row  = null;
		TreeNode node = null;
        deque.addFirst(root);
        
        while(!deque.isEmpty()) {
            
            row = new ArrayList<>();
            result.add(row);
            int size = deque.size();
			
            while(size>0) {
                node = deque.removeFirst();                
                row.add(node.val);
                
                if(node.left!=null) {
                    deque.addLast(node.left);
                }
                
                if(node.right!=null) {
                    deque.addLast(node.right);
                }
                
                size--;
            }
            
            size = deque.size();
            if(size > 0) {
                row = new ArrayList<>();
                result.add(row);
            }
            
            while(size > 0) {
                node = deque.removeLast();
                row.add(node.val);
                
                if(node.right!=null) {
                    deque.addFirst(node.right);
                }
                
                if(node.left!=null) {
                    deque.addFirst(node.left);
                }    
                
                size--;
            }
        }
        return result;
    }
}