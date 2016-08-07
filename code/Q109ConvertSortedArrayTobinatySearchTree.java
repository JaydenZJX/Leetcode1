

import javax.swing.tree.TreeNode;

/**
 *recur
 *
 */

public class Solution{
    public TreeNode sortedArrayToBST(int[] nums){

        if(nums.length == 0) return null;

        TreeNode head = help(nums, 0, nums.length-1);

        return head;
    }

    public TreeNode help(int[] nums, int left, int right)
}
