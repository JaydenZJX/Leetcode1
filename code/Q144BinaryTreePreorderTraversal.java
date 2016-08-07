import java.util.LinkedList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 *
 */

public class Solution{
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new LinkedList<Integer>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode visitNode = stack.pop();

            list.add(visitNode.val);

            if(visitNode.right !=null) stack.push(visitNode.right);
            if(visitNode.left != null) stack.push(visitNode.left);

        }

        return list;
    }
}

public List<Integer> peroderTraversal(TreeNode root){
    List<Integer> list == new LinkedList<Integer>();

    if(root == null ) return list;

    list.add(root.val);
    list.addAll(peroderTraversal(root.left));
    list.addAll(peroderTraversal(root.right));

    return list;
}
