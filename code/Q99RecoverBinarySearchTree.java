/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution{
    TreeNode a = null;
    TreeNode b = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root){

        inorder(root);

        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }

    public void inorder(TreeNode root){

        if(root == null)
            return;
        inorder(root.left);

        if(a == null && root.val <= per.val){
            a = per;
        }
        if(a != null && root.val <= per.val){
            b = root;
        }

        per = root;
        inorder(root.right);
        }
    }
}
