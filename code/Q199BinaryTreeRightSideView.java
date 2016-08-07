
import java.awt.Queue;

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
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result =new ArrayList<Integer>();
        if(root == null)
            return result;

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                TreeNode tmp = q.poll();
                if(i == size -1){
                    result.add(tmp.val);
                }
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right != null) q.offer(tmp.right);
            }
        }
        return result;
    }
}
