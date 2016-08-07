
import javax.swing.tree.TreeNode;


/**
 *recur
 *
 */

public class Solution{
    public TreeNode sortedListToBST(ListNode head){
        if(head == null) return null;

        return ToBST(head, null);
    }

    public TreeNode ToBST(ListNode head, ListNode tail){
        ListNode fast == head;
        ListNode slow == head;

        if(head == tail) return null;
        while(fast.next != tail && fast.next.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }

        TreeNode root = new TreeNode(slow.val);

        root.left = ToBST(head, slow);
        root.right = ToBST(slow.next,tail);

        return root;

    }
}
