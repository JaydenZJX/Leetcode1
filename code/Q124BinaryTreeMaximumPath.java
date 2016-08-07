public class Solution{
    public int maxPathSum(TreeNode root){
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;

        maxSum(max, root);

        return max[0];
    }

    public int maxSum(int[] max, TreeNode root){
        if(root == null)
            return 0;
        int left = Math.max(0, maxSum(max,root.left));
        int right= Math.max(0, maxSum(max,root.right));

        max[0] = Math.max(max[0], left+right+root.val);

        return root.val+Math.max(left,right);
    }
}
