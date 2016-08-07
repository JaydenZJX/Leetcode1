/**
 *
 */
public class Solution{
    int pInorder;
    int pPostorder;
    public TreeNode buildTree(int[] inorder, int[] postorder){
        pInorder = inorder.length;
        pPostorder = postorder.length;

        return help(inorder, postorder, null);
    }

    public TreeNode help(int[] inorder, int[] postorder, TreeNode end){

        if(pPostorder < 0)
            return null;

        TreeNode n = new TreeNode(postorder[pPostorder]);
        pPostorder--;

        if(inorder[pInorder] != n.val)
            n.right = help(inorder,postorder,end);

        pInorder--;

        if(end == null || (inorder[pInorder] != end.val))
            n.left = help(inorder, postorder, n);

        return n
    }
}
