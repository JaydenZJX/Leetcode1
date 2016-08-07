import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 *recur
 *itertion
 *
 */

public class Solution{
    public int minDepth(TreeNode root){
        if(root == null ) return 0;

        if(root.left == null) return minDepth(root.right)+1;

        if(root.right == null) return minDepth(root.left)+1;

        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}

    public int minDepth(TreeNode root){
        if(root == null ) return 0;

        int depth = 1;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        TreeNode tmp, magic = new TreeNode(9);

        queue.add(root);
        queue.add(magic);
        while(!queue.isEmpty()){
            tmp = queue.poll();

            if(tmp.equals(magic)){
                if(!queue.isEmpty()){
                    depth++;
                    queue.add(magic);
                }

                continue;
            }
            if(tmp.left ==null && tmp.right == null)
                return depth;

            if(tmp.left != null)
                queue.add(tmp.left);

            if(tmp.right != null)
                queue.add(tmp.right);
        }

        return depth;
    }
