import java.util.Stack;

import javax.swing.tree.TreeNode;
/**
 *recure
 *
 */

public class Solution{
    public boolean isValidBST(TreeNode root){
        return isValidBST(root, Long.MIN_VALUE , Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode rooot, long min, long max){
        if(root == null ) return true;

        if(root.val >= max || root.val <= min) return false;

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val,max);
    }
}

///iteration
public boolean isValidBST(TreeNode root){
    Stack<TreeNode> stack = new Stack<TreeNode>();

    TreeNode cur = root;
    TreeNode pre = null;
    while(!stack.empty() || cur != null){
        if(cur != null){
            stack.push(cur);
            cur = cur.left;
        }else{
            TreeNode p = stack.pop();

            if(per != null && p.val <pre.val){
                return false;
            }
            pre = p;
            cur = p.right;
        }
    }
    return true;
}
