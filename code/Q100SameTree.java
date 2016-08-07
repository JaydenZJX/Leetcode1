/**

import sun.nio.cs.ext.ISO_8859_6;

 *recur
 */
public class Solution{
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q== null) return true;
        if(p== null || q== null) return false;

        if(q.val==p.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);

        return false;
    }
    
}
