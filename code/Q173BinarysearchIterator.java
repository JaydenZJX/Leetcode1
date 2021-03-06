/**

import javax.swing.tree.TreeNode;

/**

import java.util.Stack;

 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    Stack<TreeNode> stack;
    TreeNode cur = null;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        cur = root;
            }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        retur !stack.isEmpty()|| cur != null;
    }

    /** @return the next smallest number */
    public int next() {
        while(cur != null){
            stack.push(cur);
            cur=cur.left;
        }

        TreeNode tmp =stack.pop();
        cur = tmp.right;
        return tmp.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
