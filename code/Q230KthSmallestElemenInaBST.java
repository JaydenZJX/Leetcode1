
import java.util.Stack;
/**
 *
 *stack
 */

public class Solution{
    public int kthSmallest(TreeNode root, int k){
        Stack<TreeNode> stack = new Stack<>();

        while(root != null){
            stack.push(root.left);
            root = root.left;
        }

        while(k != 0){
            TreeNode tmp = stack.pop();
            k--;
            if(k == 0) return tmp.val;
            TreeNode right = tmp.right;

            while(right != null){
                stack.push(right);
                right = right.left;
            }
        }
        return -1;
    }
}


public class Solution{
    private int number = 0;
    private int count = 0;

    public int kthSmallest(TreeNode root, int k){
        count = k;
        helper(root);
        return number;
    }

    public void helper(TreeNode n){
        if(n.left != null) helper(n.left);
        count--;
        if(count == 0){
            number = n.val;
            return;
        }
        if(n.right != null) helper(n.right);
    }
}
