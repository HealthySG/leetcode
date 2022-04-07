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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,List<Pair>> m=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<descriptions.length;i++)
        {
            s.add(descriptions[i][1]);
            if(m.containsKey(descriptions[i][0]))
            {
                List<Pair> pairs=new ArrayList<>(m.get(descriptions[i][0]));
                pairs.add(new Pair(descriptions[i][1],descriptions[i][2]));
                m.put(descriptions[i][0],pairs);
            }
            else
            {
                List<Pair> ll=new ArrayList<Pair>();
                ll.add(new Pair(descriptions[i][1],descriptions[i][2]));
                m.put(descriptions[i][0],ll);
            }
        }
        int parent=0;
         for(int i=0;i<descriptions.length;i++)
        {
             if(!s.contains(descriptions[i][0]))
             {
                     parent=descriptions[i][0];
                 break;
             }
        }
        TreeNode parent1=new TreeNode(parent);
        return help(parent1,m);
     //   System.out.println(m);
        //return parent1;
    }
    TreeNode help(TreeNode parent,Map<Integer,List<Pair>> m)
    {
        if(!m.containsKey(parent.val))
        {
            return new TreeNode(parent.val);
        }
        else if(m.containsKey(parent.val))
        {
            List<Pair> getchild=m.get(parent.val);
            for(int i=0;i<getchild.size();i++)
            {
                if(getchild.get(i).isLeft==1)
                {
                    TreeNode leftNode=new TreeNode(getchild.get(i).c_data, null, null);
                     parent.left=help(leftNode,m);
                }
                else
                {
                    TreeNode rightNode=new TreeNode(getchild.get(i).c_data, null, null);
                    parent.right=help(rightNode,m);
                }
               
              //  help(getchild.get(i),m);
               
            }
        }
        return parent;
    }
    
}
class Pair
{
    int c_data;
    int isLeft;
    Pair(int c_data,int j)
    {
        isLeft=j;
        this.c_data=c_data;
    }
}