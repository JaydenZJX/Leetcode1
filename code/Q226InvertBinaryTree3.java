/**
 *iter
 *recur
 */

public class Solution{
    public TreeNode invertTree(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null) q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            TreeNode tmp = node.left;
            node.left = node.right();
            node.right = tmp;
            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right);
        }
        return root;
    }
}


/**recur*/

public class Solution{
    public TreeNode invertTree(TreeNode root){
        if(root == null) return root;


        TreeNode tmp = root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(tmp);

        return root;
    }
}
