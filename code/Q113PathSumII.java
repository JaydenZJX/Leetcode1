
import java.util.ArrayList;


/**
 *
 *DFS
 */

public class Solution{
    public List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> pathSum(TreeNode root, int sum){
        dfsVisiter(new ArrayList<Integer>(), root, sum);

        return result;
    }

    public void dfsVisiter(List<Integer> list, TreeNode root, int sum){
        if(root == null ) return;

        list.add(root.val);
        sum -= root.val;

        if(root.left == null && root.right == null){
            if(sum == 0){
                result.add(new ArrayList<Integer>(list));
            }
            return;
        }

        dfsVisiter(new ArrayList<Integer>(list), root.left, sum);
        dfsVisiter(new ArrayList<Integer>(list), root.right, sum);
    }
}
