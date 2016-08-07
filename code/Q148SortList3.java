/**
 *concure and divid
 */

public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next != null && runner.next.next != null){
            walker = walker.next;
            runner = runner.next.next;
        }
        ListNode right= walker.next;
        walker.next = null;
        ListNode left = head;
        left = sortList(left);
        right = sortList(right);
        return merge(left,right);
y
    }

    public ListNode merge(ListNode left, ListNode right){
        ListNode list = new ListNode(0);
        ListNode pointer = list;

        while(left != null && right != null){
            if(left.val <right.val){
                pointer.next=left;
                left=left.next;
            }else{
                pointer.next = right;
                right = right.next;
            }
            pointer = pointer.next;
        }
        if(left != null){
            pointer.next = left;
        }
        if(right != null){
            pointer.next = right;
        }

        return list.next;
    }
}
