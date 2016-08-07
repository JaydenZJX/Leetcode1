
import javax.swing.tree.TreeNode;


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
    public List<TreeNode> generateTrees(int n){
        if(n == 0 ) return new ArrayList<TreeNode>();

        return helper(1,n);
    }

    public List<TreeNode> helper(int start, int end){
        if(start > end){
            List<TreeNode> list = new ArrayList<TreeNode>();
            list.add(null);
            return list;
        }

        if(start == end ){
            List<TreeNode> list = new ArrayList<TreeNode>();
            list.add(new TreeNode(start));
            return list;
        }

        List<TreeNode> roots = new ArrayList<TreeNode>();
        for(int i = start; i <= end; i++){
            List<TreeNode> leftTreeNode = helper(start, i-1);
            List<TreeNode> rightTreeNode = helper(i+1 ,end);

            for(int j = 0; j < leftTreeNode.size(); j++){
                for(int k = 0; k < rightTreeNode.size();k++){
                    TreeNode root = new TreeNode(i);
                    root.left = leftTreeNode.get(j);
                    root.right = rightTreeNode.get(k);
                    roots.add(root);
                }
            }
        }
        return roots;
    }
}

