import java.util.LinkedList;
/**
 *implemented with queue;
 */

public class Solution{
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        if(root == null) return result;

        queue.offer(root);

        while(!queue.isEmpty()){
            int qLen= queue.size();
            List<Integer> list = new List<Integer>();

            for(int i=0; i<qLen; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);

                list.add(queue.poll().val);
            }
            result.add(list);

        }

        return result;
    }
}
