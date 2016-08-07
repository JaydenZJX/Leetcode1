


public class Solution{
    public int countNodes(TreeNode root){
        int left = countLeft(root);
        int right = countRight(root);

        if(left == right){
            return (1 << left) -1;
        }

        return 1+countNodes(root.left)+countNodes(root.right);
    }

    int countLeft(TreeNode root){
        int dep = 0;

        while(root != null){
            root = root.left;
            dep++;
        }

        return dep++;
    }

    int countRight(TreeNode root){

        int dep = 0;

        while(root != null){
            root = root.right;
            dep++;
        }

        return dep;
    }

}
