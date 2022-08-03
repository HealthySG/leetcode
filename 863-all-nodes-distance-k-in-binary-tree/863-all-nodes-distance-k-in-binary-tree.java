/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        Map<TreeNode,TreeNode> mp=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        rec(root,null,mp);
        
        Set<TreeNode> s=new HashSet<>();
        s.add(target);
        q.add(target);
        while(k!=0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                if(node.left!=null && !s.contains(node.left))
                {
                     q.add(node.left);
                     s.add(node.left);
                }
                   
                 if(node.right!=null && !s.contains(node.right))
                 {
                    q.add(node.right);
                     s.add(node.right);
                 }
                    
                if(mp.get(node)!=null && !s.contains(mp.get(node)))
                           {
                                 q.add(mp.get(node));
                               s.add(mp.get(node));
                           }
                  
            }
            k--;
        }
       while(!q.isEmpty())
       {
           TreeNode y=q.poll();
            ans.add(y.val);
       }
          
     /*   TreeNode parent=rec(root,target);
        if(parent!=null)
        {
            if(parent.left!=target)
                rec2(parent.left,k-2);
            else
                rec2(parent.right,k-2);
        }
        rec2(target,k);
       // System.out.println(parent.val);*/
        return ans;
            
    }
    void rec(TreeNode root,TreeNode parent,Map<TreeNode,TreeNode> mp)
    {
        if(root!=null)
        {
            mp.put(root,parent);
            rec(root.left,root,mp);
            rec(root.right,root,mp);
        }
       
      //  return leftpar==null?rightpar:leftpar;
    }
    /*void rec2(TreeNode root, int dis)
    {
        
        if(dis<0)
            return;
        if(dis==0)
            ans.add(root.val);
        if(root.left!=null)
            rec2(root.left,dis-1);
        if(root.right!=null)
            rec2(root.right,dis-1);
            
    }*/
}