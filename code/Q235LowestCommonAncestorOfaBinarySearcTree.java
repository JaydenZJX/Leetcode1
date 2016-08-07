/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//O(n) O(1)
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        if(Matn.max(p.val,q.val)<root.val){
            return lowestCommonAncestor(root.left,p ,q);
        }else if(Matn.min(p.val,q.val)> root.right){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }
}


public class Solution{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        while(root != null){
            if(Math.max(p.val,q.val) < root.val){
                root=root.left;
            }else if(Math.min(p.val, q.val) > root.val){
                root=root.right;
            }else{
                return null;
            }
        }
        return null;
    }
}
