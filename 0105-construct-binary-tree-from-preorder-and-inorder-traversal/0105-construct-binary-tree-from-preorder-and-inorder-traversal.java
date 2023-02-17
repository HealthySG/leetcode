
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       int n=preorder.length;
       return rec(preorder,inorder,0,n-1,0,n-1);
    }
    TreeNode rec(int[] preorder, int[] inorder,int inStart,int inEnd,int preStart,int preEnd)
    {
         if (inStart > inEnd) {
            return null;
        }
        int rootval=preorder[preStart];
        TreeNode rootNode=new TreeNode(rootval);
        int rootIndex=inStart;
        for(;rootIndex<inEnd;rootIndex++)
        {
            if(inorder[rootIndex]==rootval)
                break;
        }
        int leftTreeSize=rootIndex-inStart;
        int rightTreeSize=inEnd-rootIndex;
        // System.out.println(leftTreeSize);
        // System.out.println(rightTreeSize);
        rootNode.left=rec(preorder,inorder,inStart,rootIndex-1,preStart+1,preStart+leftTreeSize);       rootNode.right=rec(preorder,inorder,rootIndex+1,inEnd,preStart+leftTreeSize+1,preEnd);
        return rootNode;
    }
}