import java.util.Stack;

import javax.swing.tree.TreeNode;

/**
 *
 *Stack
 *recur
 */

public class Solution{
    public void flatten(TreeNode root){
        if(root ==null) return;
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode cur = stack.pop;

            if(cur.right != null)
                stack.push(cur.right);

            if(cur.left != null)
                stack.push(cur.left);

            if(!stack.isEmpty())
                cur.right = stack.peek();

            cur.left = null;:
        }
    }
}

public void flatten(TreeNode root){
    if(root == null)
        return ;

    TreeNode left = root.left;
    TreeNode right = root.right;

    root.left = null;

    flatten(left);
    flatten(right);

    root.right = left;
    TreeNode cur = root;

    while(cur.right != null) cur = cur.right;

    cur.right = right;
}
