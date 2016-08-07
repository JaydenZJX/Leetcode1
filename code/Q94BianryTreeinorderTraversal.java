

import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/**
 *
 *stack
 */

public class Slution{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();

        if(root == null) return list;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;


        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;

    }
}
