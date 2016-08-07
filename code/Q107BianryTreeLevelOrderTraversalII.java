
import java.awt.Queue;
import java.util.LinkedList;

/**
 *queue and List use add(index,objext)
 */


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
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        
        if(root == null) return result;

        q.offer(root);

        while(!q.isEmpty()){
            int qLen = q.size();
            List<Integer> list = new LinkedList<Integer>();
            for(int i = 0; i < qLen; i++){
                TreeNode tmp = q.peek();
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right != null) q.offer(tmp.right);
                list.add(q.poll().val);
            }
            result.add(0,list);
        }

        return result;
    }

}
