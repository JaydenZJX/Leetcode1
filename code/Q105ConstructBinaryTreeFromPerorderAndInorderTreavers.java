import javax.swing.tree.TreeNode;


/**
 *
 *recr
 */

public class Solution{
    public TreeNode buildTree(int[] preorder, int[] inorder){
        return BSTBuilder(0, 0, inorder.length, preorder, inorder);
    }

    public TreeNode BSTBuilder(int perStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(perStart > preorder.length-1 || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inIndex = 0;

        for(int i = inStart; i <= inEnd; i++){
            if(root.val == inorder[i]){
                inIndex = i;
            }
        }

        root.left = BSTBuilder(perStart + 1 , inStart, inIndex-1, preorder, inorder);
        root.right = BSTBuilder(perStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);

        return root;
    }
}
