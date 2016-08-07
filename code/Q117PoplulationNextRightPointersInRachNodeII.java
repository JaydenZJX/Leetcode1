


/**
 *level Treversel
 */

public class Solution{
    public void connect(TreeLinkNode root){
        while(root != null){
            TreeLinkNode dummy = new TreeLinkNode(0);
            TreeLinkNode per = dummy;
            while(root != null){
                if(root.left != null){
                    per.next = root.left;
                    per = per.next;
                }

                if(root.right != null){
                    per.next = root.right;
                    per = per.next;
                }
                root = root.next;
   
            }
            root = dummy.next;
        }
    }
}
